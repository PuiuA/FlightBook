package io.lazy.model;

import lombok.Getter;

@Getter
public enum ServiceType {
    LARGE_BAGGAGE("Bagaj de cala mare (20-32 kg)", 49.5F),
    SMALL_CABIN_BAG("Bagaj de cabina mic (max. 10 kg)",35.4F),
    PRIORITY_BOARDING("Îmbarcare prioritară",40.35F),
    SEAT_SELECTION("Selectare loc",17.75F),
    EXTRA_LEGROOM_SEAT("Loc cu spațiu suplimentar pentru picioare",53.45F),
    MEAL_ON_BOARD("Meniu la bord",37.7F),
    TRAVEL_INSURANCE("Asigurare de călătorie",42.9F),
    FAST_TRACK("Control de securitate rapid",46.4F),
    LOUNGE_ACCESS("Acces la lounge",35.6F),
    FLEXIBLE_TICKET("Bilet flexibil",65.6F);

    private final String description;
    private final Float price;

    ServiceType(String description, Float price) {
        this.description = description;
        this.price = price;
    }
}