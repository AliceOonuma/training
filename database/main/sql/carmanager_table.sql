CREATE SCHEMA account;
CREATE SCHEMA car;
CREATE SCHEMA oiling;

CREATE SEQUENCE account.user_id;
CREATE SEQUENCE car.car_id;
CREATE SEQUENCE oiling.oiling_id;

CREATE TABLE account.user
(

user_id integer NOT NULL PRIMARY KEY,
user_name character varying(10) NOT NULL,
account_name character varying(20) UNIQUE NOT NULL,
password character varying(20) NOT NULL,
updated_at timestamp NOT NULL

);

CREATE TABLE car.gasoline_type
(

gasoline_type character varying(10) NOT NULL PRIMARY KEY,
gasoline_name character varying(5) NOT NULL,
created_at timestamp NOT NULL

);

CREATE TABLE car.car
(

car_id integer NOT NULL PRIMARY KEY,
user_id integer NOT NULL,
car_name character varying(10) NOT NULL,
gasoline_type character varying(10) NOT NULL,
gasolinetank_capacity integer NOT NULL,
updated_at timestamp NOT NULL,

FOREIGN KEY (user_id) REFERENCES account.user(user_id),
FOREIGN KEY (gasoline_type) REFERENCES car.gasoline_type(gasoline_type)

);

CREATE TABLE car.initial_car_status
(

car_id integer NOT NULL PRIMARY KEY,
odometer integer NOT NULL,
gasoline_quantity integer NOT NULL,
created_at timestamp NOT NULL,

FOREIGN KEY (car_id) REFERENCES car.car(car_id)

);

CREATE TABLE oiling.oiling
(

oiling_id integer NOT NULL PRIMARY KEY,
car_id integer NOT NULL,
oiling_day date NOT NULL,
updated_at timestamp NOT NULL,

FOREIGN KEY (car_id) REFERENCES car.car(car_id)

);

CREATE TABLE oiling.oiling_detail
(

oiling_id integer NOT NULL PRIMARY KEY,
gasoline_quantity integer NOT NULL,
oiling_quantity integer NOT NULL,
odometer integer NOT NULL,
gasoline_price integer NOT NULL,
updated_at timestamp NOT NULL,

FOREIGN KEY (oiling_id) REFERENCES oiling.oiling(oiling_id)

);