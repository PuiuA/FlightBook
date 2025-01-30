CREATE TABLE IF NOT EXISTS flight_book.status (
    id BIGSERIAL primary key,
    name VARCHAR(50) NOT NULL    -- ENUM stocat ca string
);
INSERT INTO flight_book.status(name)
VALUES ('BOOKED'),('PAID'),
       ('CHECKED_IN'),('BOARDING'),
       ('BOARDED'),('IN_FLIGHT'),
       ('CANCELED'),('COMPLETED');
