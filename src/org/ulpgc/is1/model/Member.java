package org.ulpgc.is1.model;
import java.time.LocalDateTime;
public class Member {
    public LocalDateTime date;
    public Member() {
        this.date = LocalDateTime.now();
    }

    public LocalDateTime getDate() {
        return date;
    }
}
