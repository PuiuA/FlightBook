CREATE TABLE IF NOT EXISTS flight_book.airport(
    id BIGSERIAL primary key,
    name varchar(100) NOT NULL,
    city varchar(100) NOT NULL,
    country varchar(100) NOT NULL
);
