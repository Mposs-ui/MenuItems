create database springmenu;
use springMenu;


create table foodinfo(id int not null auto_increment, 
	name varchar(30), price double(4, 2), gramsfat int, calories int,
	primary key(id));