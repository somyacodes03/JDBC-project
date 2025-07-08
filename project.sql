create database airlinemanagementsystem;

use airlinemanagementsystem;

create table login(username varchar(20), password varchar(20));
select * from login;
insert into login values("admin", "admin");

create table passenger(name varchar(20), nationality varchar(20), phone varchar(20), aadhar varchar(20), address varchar(50), gender varchar(20));
select * from passenger;

create table flight(f_code varchar(20), f_name varchar(20), source varchar(40), destination varchar(40));
describe flight;
insert into flight values("1001", "AI-1111", "Delhi", "Mumbai");
insert into flight values("1002", "AI-1212", "Delhi", "Goa");
insert into flight values("1003", "AI-1232", "Mumbai", "Chennai");
insert into flight values("1004", "AI-1289", "Delhi", "Amritsar");
insert into flight values("1005", "AI-1229", "Delhi", "Ayodhyar");
select * from flight;

create table reservation(PNR varchar(15) , TIC varchar(20), aadhar varchar(20) , name varchar(20), nationality varchar(30), flightname varchar(20), flightcode varchar(20), src varchar(30), dest varchar(30), ddate varchar(20));
desc reservation;
select * from reservation;

create table cancel(pnr varchar(20), name varchar(40), cancelno varchar(20), fcode varchar(30), ddate varchar(30));
select * from cancel;
show tables;
drop table flight;