create table Product(
    id serial primary key ,
    name varchar(255),
    price numeric(10,2),
    creation_datetime timestamp default current_timestamp
);
create table Product_category(
    id serial primary key ,
    name varchar(255),
    product_id int references Product(id)
);