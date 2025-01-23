package io.lazy.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="status", schema = "flight_book")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @Enumerated(EnumType.STRING)
    private StatusName name;

}