package camera_DTO;  // 관례상 camera.dto 권장(소문자 패키지)

import java.time.Instant;

public class QrLoginToken {

    private long id;
    private String tokenHash;   // SHA-256(code)
    private long userId;
    private Instant expiresAt;
    private boolean used;
    private Instant usedAt;

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getTokenHash() { return tokenHash; }
    public void setTokenHash(String tokenHash) { this.tokenHash = tokenHash; }

    public long getUserId() { return userId; }
    public void setUserId(long userId) { this.userId = userId; }

    public Instant getExpiresAt() { return expiresAt; }
    public void setExpiresAt(Instant expiresAt) { this.expiresAt = expiresAt; }

    public boolean isUsed() { return used; }
    public void setUsed(boolean used) { this.used = used; }

    public Instant getUsedAt() { return usedAt; }
    public void setUsedAt(Instant usedAt) { this.usedAt = usedAt; }
}
