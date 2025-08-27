package QrLoginService;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Optional;

public class QrLoginService {

    private final QrLoginTokenRepository tokenRepo; // 구현체/JPA/마이바티스 등
    private final UserRepository userRepo;

    public QrLoginService(QrLoginTokenRepository tokenRepo, UserRepository userRepo) {
        this.tokenRepo = tokenRepo;
        this.userRepo = userRepo;
    }

    public Optional<User> consumeToken(String rawCode) {
        String hash = sha256(rawCode);
        Optional<QrLoginToken> opt = tokenRepo.findValidByHash(hash, Instant.now());
        if (opt.isEmpty()) return Optional.empty();

        QrLoginToken t = opt.get();
        if (t.isUsed() || t.getExpiresAt().isBefore(Instant.now())) {
            return Optional.empty();
        }
        // 단발 처리
        t.setUsed(true);
        t.setUsedAt(Instant.now());
        tokenRepo.save(t);

        return userRepo.findById(t.getUserId());
    }

    private static String sha256(String s) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] out = md.digest(s.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : out) sb.append(String.format("%02x", b));
            return sb.toString();
        } catch (Exception e) { throw new RuntimeException(e); }
    }
}
