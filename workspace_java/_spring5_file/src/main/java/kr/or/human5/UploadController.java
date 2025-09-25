package kr.or.human5;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

// ▼ 추가 (부모 폴더 보장/경로 처리용)
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class UploadController {

    @RequestMapping("/upload.do")
    public String u() {
        return "uploadForm";
    }

    @RequestMapping("/upload")
    public String upload(MultipartHttpServletRequest req) throws UnsupportedEncodingException {
    	
    	
    	// multipart로 보내고 
    	//1. HttpServletRequest로 받으면 getParameter 사용 불가
    	//2. MultipleHttpServletRequest로 받으면 getParameter 사용 가능
    	
    	

        String title = req.getParameter("title");
        String content = req.getParameter("content");
        System.out.println("title: " + title);
        System.out.println("content: " + content);

        MultipartFile mf = req.getFile("file1");

        // ▼ 추가: 널/빈 파일 방어
        if (mf == null || mf.isEmpty()) {
            System.out.println("no file uploaded");
            // return "redirect:uploadForm.jsp"; // ❌ JSP 직접 접근 금지
            return "redirect:/upload.do"; // ✅ 컨트롤러 매핑으로 이동
        }

        long fileSize = mf.getSize();
        System.out.println("fileSize: " + fileSize);

        String fileName = mf.getOriginalFilename();
        System.out.println("fileName: " + fileName);

        try {
            // String path = "C:\\temp\\upload"; // ❌ 대소문자 혼용/이스케이프 이슈
            String path = "C:/Temp/upload"; // ✅ 경로 통일(윈도우에서도 '/' 가능)

            // ▼ 추가: 부모 폴더 없으면 생성(예외 근본 원인 해결)
            Files.createDirectories(Paths.get(path));

            // ▼ 추가: 파일명 정규화(상위경로 제거 + 윈도우 금지문자 치환)
            fileName = fileName == null ? "unnamed" : Paths.get(fileName).getFileName().toString();
            fileName = fileName.replaceAll("[\\\\/:*?\"<>|]", "_");

            String safeFileName = path + "/" + System.currentTimeMillis() + "_" + fileName;
            System.out.println("safeFileName: " + safeFileName);
            File file = new File(safeFileName);

            mf.transferTo(file);

        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // return "redirect:uploadForm.jsp"; // ❌ /WEB-INF 접근 불가
        return "redirect:/upload.do";       // ✅ 매핑으로 리다이렉트
    }

    @RequestMapping("/uploads")
    public String uploads(MultipartHttpServletRequest req) throws UnsupportedEncodingException {

        String title = req.getParameter("title");
        String content = req.getParameter("content");
        System.out.println("title: " + title);
        System.out.println("content: " + content);

        List<MultipartFile> fileList = req.getFiles("file1");

        try {
            // String path = "C:\\temp\\upload"; // ❌
            String path = "C:/Temp/upload"; // ✅
            Files.createDirectories(Paths.get(path)); // ✅ 부모 폴더 보장

            for (MultipartFile mf : fileList) {
                if (mf == null || mf.isEmpty()) continue;

                long fileSize = mf.getSize();
                System.out.println("fileSize: " + fileSize);

                String fileName = mf.getOriginalFilename();
                System.out.println("fileName: " + fileName);

                // ▼ 동일하게 파일명 정규화
                fileName = fileName == null ? "unnamed" : Paths.get(fileName).getFileName().toString();
                fileName = fileName.replaceAll("[\\\\/:*?\"<>|]", "_");

                String safeFileName = path + "/" + System.currentTimeMillis() + "_" + fileName;
                System.out.println("safeFileName: " + safeFileName);
                File file = new File(safeFileName);

                mf.transferTo(file);
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // return "redirect:uploadForm.jsp"; // ❌
        return "redirect:/upload.do";       // ✅
    }
}
