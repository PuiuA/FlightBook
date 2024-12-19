CREATE TABLE airport(
    id SERIAL primary key NOT NULL,
    departure_airport_id integer NOT NULL ,
    arrival_airport_id integer NOT NULL,
    foreign key (departure_airport_id) references airport(id),
    foreign key (arrival_airport_id) references  airport(id)
);
