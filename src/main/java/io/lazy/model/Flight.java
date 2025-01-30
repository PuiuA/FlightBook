package io.lazy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "flight", schema = "flight_book")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "flight_number", nullable = false)
    String flightNumber;

    @ManyToOne
    @JoinColumn(name = "departure_airport_id", nullable = false)
    private Airport departureAirport;
    @ManyToOne
    @JoinColumn(name = "arrival_airport_id", nullable = false)
    private Airport arrivalAirport;

    @Column(name="departure_date_time")
    private LocalDateTime departureDateTime;
    @Column(name="arrival_date_time")
    private LocalDateTime arrivalDateTime;

    @ManyToOne
    @JoinColumn(name = "airplane_id")
    Airplane airplane;

}
