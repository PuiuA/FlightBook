package io.lazy.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="zbor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Zbor {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Integer id;

    @ManyToOne
    @JoinColumn(name = "departure_airport_id", nullable = false)
    Airport departureAirport;

    @ManyToOne
    @JoinColumn(name = "arrival_airport_id", nullable = false)
    Airport arrivalAirport;

}
