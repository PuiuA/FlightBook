package io.lazy.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.*;
import java.util.*;

@Entity
@Table(name="ticket", schema = "flight_book")
@Data
@NoArgsConstructor
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

    @ManyToMany
    @JoinTable(
            schema = "flight_book",
            name = "service_ticket",
            joinColumns = @JoinColumn(name = "ticket_id"),
            inverseJoinColumns = @JoinColumn(name = "service_id")
    )
    private List<Service> services = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;

    @JsonIgnore
    private Float price;

}
