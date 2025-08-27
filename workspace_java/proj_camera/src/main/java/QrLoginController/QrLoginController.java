package QrLoginController;   // ← 실제 패키지로 바꾸기

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// ↓ 당신 프로젝트의 실제 패키지로 임포트 교체
//import your.app.service.QrLoginService;
//import your.app.dto.QrLoginRequest;
//import your.app.domain.User;


@RestController
@RequestMapping("/api/qr-login")
public class QrLoginController {

    private final QrLoginService qrLoginService;

    public QrLoginController(QrLoginService qrLoginService) {
        this.qrLoginService = qrLoginService;
    }

    @PostMapping("/claim")
    public ResponseEntity<?> claim(@RequestBody QrLoginRequest req,
                                   HttpServletRequest httpReq) {
        String code = req.getCode();
        if (code == null || code.length() < 4) {
            return ResponseEntity.badRequest().body("잘못된 코드");
        }

        Optional<User> userOpt = qrLoginService.consumeToken(code);
        if (userOpt.isEmpty()) {
            return ResponseEntity.status(401).body("토큰 만료 또는 무효");
        }

        HttpSession session = httpReq.getSession(true);
        session.setAttribute("LOGIN_USER_ID", userOpt.get().getId());
        return ResponseEntity.ok().build();
    }
}
