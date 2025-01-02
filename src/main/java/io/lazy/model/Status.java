package io.lazy.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="status")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Status {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private StatusName name;

    public enum StatusName {
        BOOKED,            // Bilet rezervat
        PAID,              // Plata confirmată
        CHECKED_IN,        // Pasagerul a făcut check-in
        BOARDING,          // Pasagerul este în proces de îmbarcare
        BOARDED,           // Pasagerul este îmbarcat
        IN_FLIGHT,         // Pasagerul este în timpul zborului
        CANCELED,          // Bilet anulat
        COMPLETED          // Zbor finalizat
    }

}
