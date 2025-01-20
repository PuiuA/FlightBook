package io.lazy.model;

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
