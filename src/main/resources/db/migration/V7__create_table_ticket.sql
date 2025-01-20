CREATE TABLE IF NOT EXISTS flight_book.ticket(
    id SERIAL PRIMARY KEY,
    flight_number varchar(10) NOT NULL,
    seat_number varchar(4) NOT NULL,
    client_id integer,
    price float,
    departure_date_time TIMESTAMP,
    arrival_date_time TIMESTAMP,
    arrival_airport_id integer NOT NULL ,
    departure_airport_id integer NOT NULL,
    FOREIGN KEY (client_id) references flight_book.client(id),
    FOREIGN KEY (arrival_airport_id) references flight_book.airport(id),
    FOREIGN KEY (departure_airport_id) references flight_book.airport(id)
);
