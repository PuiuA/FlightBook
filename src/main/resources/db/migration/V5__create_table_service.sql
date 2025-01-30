CREATE TABLE IF NOT EXISTS flight_book.service (
   id SERIAL PRIMARY KEY,
   name VARCHAR(50) NOT NULL,
   description VARCHAR(150) NOT NULL,
   price FLOAT NOT NULL
);
INSERT INTO flight_book.service(name,description,price)
VALUES ('LARGE_BAGGAGE','Bagaj de cala mare (20-32 kg)',49.5),
       ('SMALL_CABIN_BAG','Bagaj de cabina mic (max. 10 kg)',35.4),
       ('PRIORITY_BOARDING','Îmbarcare prioritară',40.35),
       ('SEAT_SELECTION','Selectare loc',17.75),
       ('EXTRA_LEGROOM_SEAT','Loc cu spațiu suplimentar pentru picioare',53.45),
       ('MEAL_ON_BOARD','Meniu la bord',37.7),
       ('TRAVEL_INSURANCE','Asigurare de călătorie',42.9),
       ('FAST_TRACK','Control de securitate rapid',46.4),
       ('LOUNGE_ACCESS','Acces la lounge',35.6),
       ('FLEXIBLE_TICKET','Bilet flexibil',65.6);
