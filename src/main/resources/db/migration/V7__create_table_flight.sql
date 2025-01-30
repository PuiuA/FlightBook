CREATE TABLE IF NOT EXISTS flight_book.flight (
      id BIGSERIAL primary key,
      flight_number varchar(10),
      departure_date_time TIMESTAMP,
      arrival_date_time TIMESTAMP,
      departure_airport_id bigint NOT NULL,
      arrival_airport_id bigint NOT NULL ,
      airplane_id bigint NOT NULL ,
      FOREIGN KEY (arrival_airport_id) references flight_book.airport(id),
      FOREIGN KEY (departure_airport_id) references flight_book.airport(id),
      FOREIGN KEY (airplane_id) references flight_book.airplane(id)
);