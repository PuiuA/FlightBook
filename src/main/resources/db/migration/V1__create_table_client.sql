CREATE TABLE IF NOT EXISTS client (
    id_client SERIAL primary key NOT NULL ,
    first_name varchar(100) NOT NULL,
    last_name varchar(100) NOT NULL,
    age integer
);
