package io.lazy.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.*;
import java.util.*;

@Entity
@Table(name="ticket", schema = "flight_book")
@Data
@AllArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="seat_number")
    private String seatNumber;

    @OneToOne
    @JoinColumn(name="client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "departure_airport_id", nullable = false)
    private Airport departureAirport;

    @ManyToOne
    @JoinColumn(name = "arrival_airport_id", nullable = false)
    private Airport arrivalAirport;

    @ManyToMany
    @JoinTable(
            schema = "flight_book",
            name = "service_ticket",
            joinColumns = @JoinColumn(name = "ticket_id"),
            inverseJoinColumns = @JoinColumn(name = "service_id")
    )
    private List<Service> services = new ArrayList<>();

    @Column(name="departure_date_time")
    private LocalDateTime departureDateTime;
    @Column(name="arrival_date_time")
    private LocalDateTime arrivalDateTime;
    @Column(name = "flight_number")
    private String flightNumber;

    @JsonIgnore
    private Float price;

    public Ticket() {
        Random random = new Random();
        this.client = new Client();
    }


}
