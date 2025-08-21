package emp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;

@WebServlet("/add")
public class EmpAddController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // 폼 페이지 (response.getWriter로 출력)
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        String ctx = request.getContextPath();

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html><head><meta charset='UTF-8'><title>사원 등록</title></head><body>");
            out.println("<h2>사원 등록</h2>");
            out.println("<form method='post' action='" + ctx + "/add'>");
            out.println("사번(empno): <input type='number' name='empno' required><br>");
            out.println("이름(ename): <input type='text' name='ename' required><br>");
            out.println("직무(job): <input type='text' name='job'><br>");
            out.println("매니저번호(mgr): <input type='number' name='mgr'><br>");
            out.println("입사일(hiredate): <input type='date' name='hiredate' required><br>");
            out.println("급여(sal): <input type='number' name='sal'><br>");
            out.println("커미션(comm): <input type='number' name='comm'><br>");
            out.println("부서번호(deptno): <input type='number' name='deptno' required><br>");
            out.println("<button type='submit'>등록</button>");
            out.println("</form>");
            out.println("</body></html>");
        }
    }

    // 삽입 처리
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        try {
            EmpDTO dto = new EmpDTO();

            // 수동 PK 입력 (필수)
            dto.setEmpno(Integer.parseInt(getParamOrThrow(request, "empno")));

            dto.setEname(getParamOrDefault(request, "ename", ""));
            dto.setJob(getParamOrDefault(request, "job", null));

            String mgrStr = request.getParameter("mgr");
            dto.setMgr(isBlank(mgrStr) ? 0 : Integer.parseInt(mgrStr));

            String hire = getParamOrThrow(request, "hiredate"); // yyyy-MM-dd
            dto.setHiredate(Date.valueOf(hire));

            String salStr = request.getParameter("sal");
            dto.setSal(isBlank(salStr) ? 0 : Integer.parseInt(salStr));

            String commStr = request.getParameter("comm");
            dto.setComm(isBlank(commStr) ? 0 : Integer.parseInt(commStr));

            dto.setDeptno(Integer.parseInt(getParamOrThrow(request, "deptno")));

            int result = new EmpService().addEmp(dto);

            // 성공 시 리스트로 이동 (result를 쿼리스트링으로 전달)
            response.sendRedirect(request.getContextPath() + "/list?result=" + result);

        } catch (Exception e) {
            // 어디서 실패했는지 바로 보이도록 500으로 올립니다.
            throw new ServletException("사원 등록 실패", e);
        }
    }

    private static boolean isBlank(String s) {
        return s == null || s.isBlank();
    }

    private static String getParamOrThrow(HttpServletRequest req, String name) {
        String v = req.getParameter(name);
        if (v == null || v.isBlank()) throw new IllegalArgumentException("필수 파라미터 누락: " + name);
        return v;
    }

    private static String getParamOrDefault(HttpServletRequest req, String name, String def) {
        String v = req.getParameter(name);
        return (v == null || v.isBlank()) ? def : v;
    }
}
