package sec01.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutPut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "c:\\temp" ;
		String filename = "test.txt";
		
		OutputStream os = null;
		
		try {
			os = new FileOutputStream(path  + System.getProperty("file.separator")+ filename);
			System.out.println("파일 경로를 불러옵니다.");
			String data = "asd\'n'sdadssd\n62";
			byte[] datas = data.getBytes();
			
			//쓰기
			System.out.println("파일 작성중");
			os.write(datas, 0 , datas.length);
			os.flush(); // 버퍼에 남은 데이터 모두 출력
			System.out.println("파일 작성 완료");
			os.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			} finally {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

	}

}
