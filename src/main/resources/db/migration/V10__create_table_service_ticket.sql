CREATE TABLE IF NOT EXISTS flight_book.service_ticket (
      service_id BIGINT NOT NULL,
      ticket_id BIGINT NOT NULL,
      PRIMARY KEY (service_id, ticket_id),
      CONSTRAINT fk_service FOREIGN KEY (service_id) REFERENCES flight_book.service(id),
      CONSTRAINT fk_ticket FOREIGN KEY (ticket_id) REFERENCES flight_book.ticket(id)
);