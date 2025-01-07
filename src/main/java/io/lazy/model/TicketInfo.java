package io.lazy.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Table(name="ticket")
@Data
@AllArgsConstructor
public class TicketInfo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name="seat_number")
    private String seatNumber;

    @ManyToOne
    @JoinColumn(name="class_type", nullable = false)
    private ClassType classType;

    @OneToOne
    @JoinColumn(name="client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "departure_airport_id", nullable = false)
    private Airport departureAirport;

    @ManyToOne
    @JoinColumn(name = "arrival_airport_id", nullable = false)
    private Airport arrivalAirport;

    @OneToMany()
    private ArrayList<Service> services = new ArrayList<>();


    public TicketInfo() {
        Random random = new Random();
        this.seatNumber = (1 + random.nextInt(50)) + "" + (char) ('A' + random.nextInt(6));
        this.client = new Client();
    }

}
