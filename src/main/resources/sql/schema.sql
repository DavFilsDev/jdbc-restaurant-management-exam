create type dish_type_enum as enum ('START', 'MAIN', 'DESSERT');


create table dish (
                      id serial constraint dish_pk primary key,
                      name varchar(255),
                      dish_type dish_type_enum
);


create type ingredient_category as enum ('VEGETABLE', 'ANIMAL', 'MARINE', 'DAIRY', 'OTHER');


create table ingredient (
                            id serial ingredient_pk primary key,
                            name varchar(255),
                            price numeric(10, 2) CHECK (price >= 0),
                            category ingredient_category,
                            id_dish int references dish(id)
);
