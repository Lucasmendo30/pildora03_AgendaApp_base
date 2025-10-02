package org.ulpgc.is1.model;
import java.time.LocalDateTime;
public class Member {
    public Contact contact;
    public Group group;
    public LocalDateTime fecha;
    public Member() {
        this.fecha = LocalDateTime.now();
    }

    public LocalDateTime getDate() {
        return fecha;
    }
}
