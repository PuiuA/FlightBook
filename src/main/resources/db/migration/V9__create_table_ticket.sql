CREATE TABLE IF NOT EXISTS flight_book.ticket(
    id SERIAL PRIMARY KEY,
    flight_id bigint,
    seat_number varchar(4),
    client_id bigint,
    price float,
    FOREIGN KEY (client_id) references flight_book.client(id),
    FOREIGN KEY (flight_id) references flight_book.flight(id)
);
