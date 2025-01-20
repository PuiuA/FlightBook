CREATE TABLE IF NOT EXISTS flight_book.client (
    id BIGSERIAL primary key,
    first_name varchar(100) NOT NULL,
    last_name varchar(100) NOT NULL,
    age integer NOT NULL,
    gender VARCHAR(50) not null check (gender in ('female', 'male')),
    status bigint not null ,
    foreign key (status) references flight_book.status(id)
);
