CREATE TABLE IF NOT EXISTS flight_book.seat_number(
  id BIGSERIAL PRIMARY KEY ,
  seat_code varchar(4),
  is_available boolean,
  flight_id bigint,
  foreign key (flight_id) references flight_book.flight(id)
);