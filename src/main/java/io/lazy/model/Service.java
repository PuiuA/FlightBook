package io.lazy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private ServiceType name;

    @Getter
    public enum ServiceType {
        LARGE_BAGGAGE("Bagaj de cala mare (20-32 kg)"),
        SMALL_CABIN_BAG("Bagaj de cabina mic (max. 10 kg)"),
        PRIORITY_BOARDING("Îmbarcare prioritară"),
        SEAT_SELECTION("Selectare loc"),
        EXTRA_LEGROOM_SEAT("Loc cu spațiu suplimentar pentru picioare"),
        MEAL_ON_BOARD("Meniu la bord"),
        TRAVEL_INSURANCE("Asigurare de călătorie"),
        FAST_TRACK("Control de securitate rapid"),
        LOUNGE_ACCESS("Acces la lounge"),
        FLEXIBLE_TICKET("Bilet flexibil");

        private final String description;

        ServiceType(String description) {
            this.description = description;
        }
    }
}
