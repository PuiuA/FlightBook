CREATE TABLE IF NOT EXISTS flight_book.airport(
    id BIGSERIAL primary key,
    name varchar(100) NOT NULL,
    city varchar(100) NOT NULL,
    country varchar(100) NOT NULL
);
INSERT INTO flight_book.airport(name, city, country)
VALUES ('Henri Coandă International Airport', 'Bucharest', 'Romania'),
       ('John F. Kennedy International Airport', 'New York', 'United States'),
       ('Charles de Gaulle Airport', 'Paris', 'France'),
       ('Heathrow Airport', 'London', 'United Kingdom'),
       ('Frankfurt Airport', 'Frankfurt', 'Germany'),
       ('Dubai International Airport', 'Dubai', 'United Arab Emirates'),
       ('Changi Airport', 'Singapore', 'Singapore'),
       ('Tokyo Haneda Airport', 'Tokyo', 'Japan'),
       ('Sydney Kingsford Smith Airport', 'Sydney', 'Australia'),
       ('São Paulo–Guarulhos International Airport', 'São Paulo', 'Brazil');