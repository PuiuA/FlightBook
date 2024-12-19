CREATE TABLE IF NOT EXISTS ticket(
    id SERIAL PRIMARY KEY,
    seat_number varchar(4) NOT NULL ,
    class_type integer,
    status integer,
    zbor_id integer,
    client_id integer,
    price integer,
    FOREIGN KEY (class_type) references class_type(id),
    FOREIGN KEY (status) references  status(id),
    FOREIGN KEY (zbor_id) references zbor(id),
    FOREIGN KEY (client_id) references client(id_client)
);