CREATE TABLE flight_book.airplane (
    id BIGSERIAL PRIMARY KEY,
    model VARCHAR(255) NOT NULL,
    plane_capacity VARCHAR(50) NOT NULL,
    total_seats INT NOT NULL
);

INSERT INTO flight_book.airplane (model, plane_capacity, total_seats) VALUES
   ('Boeing 737', 'MEDIUM', 29),
   ('Airbus A320', 'LARGE', 41),
   ('Boeing 747', 'EXTRA_LARGE', 47);