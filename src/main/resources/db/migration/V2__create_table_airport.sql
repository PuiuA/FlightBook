CREATE TABLE IF NOT EXISTS airport(
    id SERIAL primary key NOT NULL,
    name varchar(100) NOT NULL,
    city varchar(100) NOT NULL,
    country varchar(100) NOT NULL
);
