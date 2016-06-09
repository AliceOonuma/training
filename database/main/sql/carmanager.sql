CREATE USER owner_carmanager WITH PASSWORD 'owner_carmanager#1';

CREATE DATABASE carmanager OWNER owner_carmanager;

CREATE SCHEMA carmanager;

CREATE SEQUENCE carmanager.user_id;
CREATE SEQUENCE carmanager.car_id;
CREATE SEQUENCE carmanager.oiling_id;

CREATE TABLE carmanager.user
(

user_id integer NOT NULL PRIMARY KEY default nextval('carmanager.user_id'),
user_name character varying(10) NOT NULL,
account_name character varying(20) UNIQUE NOT NULL,
password character varying(20) NOT NULL,
updated_at timestamp NOT NULL

);

CREATE TABLE carmanager.gasoline_type
(

gasoline_type character varying(10) NOT NULL PRIMARY KEY,
gasoline_name character varying(5) NOT NULL,
created_at timestamp NOT NULL

);

CREATE TABLE carmanager.car
(

car_id integer NOT NULL PRIMARY KEY default nextval('carmanager.car_id'),
user_id integer NOT NULL,
car_name character varying(10) NOT NULL,
gasoline_type character varying(10) NOT NULL,
gasolinetank_capacity integer NOT NULL,
updated_at timestamp NOT NULL,

FOREIGN KEY (user_id) REFERENCES carmanager.user(user_id),
FOREIGN KEY (gasoline_type) REFERENCES carmanager.gasoline_type(gasoline_type)

);

CREATE TABLE carmanager.initial_car_status
(

car_id integer NOT NULL PRIMARY KEY,
odometer integer NOT NULL,
gasoline_quantity integer NOT NULL,
created_at timestamp NOT NULL,

FOREIGN KEY (car_id) REFERENCES carmanager.car(car_id)

);

CREATE TABLE carmanager.oiling
(

oiling_id integer NOT NULL PRIMARY KEY default nextval('carmanager.oiling_id'),
car_id integer NOT NULL,
oiling_day date NOT NULL,
updated_at timestamp NOT NULL,

FOREIGN KEY (car_id) REFERENCES carmanager.car(car_id)

);

CREATE TABLE carmanager.oiling_detail
(

oiling_id integer NOT NULL PRIMARY KEY,
gasoline_quantity integer NOT NULL,
oiling_quantity integer NOT NULL,
odometer integer NOT NULL,
gasoline_price integer NOT NULL,
updated_at timestamp NOT NULL,

FOREIGN KEY (oiling_id) REFERENCES carmanager.oiling(oiling_id)

);