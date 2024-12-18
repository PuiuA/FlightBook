package io.lazy.model;

import jakarta.persistence.*;

@Entity
@Table(name="zbor")
public class Zbor {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int id;

    @ManyToOne
    @JoinColumn(name = "departure_airport_id", nullable = false)
    Airport departureAirport;

    @ManyToOne
    @JoinColumn(name = "arrival_airport_id", nullable = false)
    Airport arrivalAirport;

    public Zbor() {}

    public Zbor(Airport departureAirport, Airport arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    @Override
    public String toString() {
        return "main.java.lazy.model.Zbor{" +
                "departureAirport=" + departureAirport +
                ", arrivalAirport=" + arrivalAirport +
                '}';
    }
}
