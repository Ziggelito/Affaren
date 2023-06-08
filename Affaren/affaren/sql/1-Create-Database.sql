

#DROP USER IF EXISTS 'dbUser2024'@'%';
#CREATE USER 'dbUser2024'@'%' IDENTIFIED BY 'secretPassword';
#GRANT all on butiken TO 'dbUser2024'@'%';

drop database if exists customerdb;
create database customerdb;
use customerdb;
create table customer (id integer not null, name varchar(255), person_nr varchar(255), primary key (id)) engine=InnoDB;
create table customer_seq (next_val bigint) engine=InnoDB;
insert into customer_seq  values ( 1 );


drop database if exists itemdb;
create database itemdb;
use itemdb;
create table items (id integer not null, name varchar(255), pris varchar(255), primary key (id)) engine=InnoDB;
create table items_seq (next_val bigint) engine=InnoDB;
insert into items_seq  values ( 1 );

drop database if exists orderdb;
create database orderdb;
use orderdb;
create table orders (id integer not null, date varchar(255), customer_Id varchar(255), item_Id varchar(255) , primary key (id)) engine=InnoDB;
create table orders_seq (next_val bigint) engine=InnoDB;
insert into orders_seq  values ( 1 );