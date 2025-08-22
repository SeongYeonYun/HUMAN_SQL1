package cookie;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("/error-test")
public class Rollbacktest extends HttpServlet {
    private static final Logger LOG = Logger.getLogger(Rollbacktest.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        LOG.info(">>> [cookie.Rollbacktest] 예외 던지기 직전 (INFO 로그 확인용)");
        throw new RuntimeException("의도적으로 발생시킨 에러!");
    }
    }