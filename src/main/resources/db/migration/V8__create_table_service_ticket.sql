CREATE TABLE IF NOT EXISTS flight_book.service_ticket(
    id BIGSERIAL primary key,
    service_id integer NOT NULL ,
    ticket_id integer NOT NULL ,
    FOREIGN KEY (service_id) references flight_book.service(id),
    FOREIGN KEY (ticket_id) references flight_book.ticket(id)
)