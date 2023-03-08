use amitha;
create table car(
	car_id varchar(10),
	car_name varchar(20),
	car_type varchar(20),
    owner_id varchar(10),
	primary key(car_id),
    foreign key(owner_id) references owner(owner_id)
);
insert into car(car_id,car_name,car_type,owner_id)
values("342","i20","fhh","78"),
("123","Innova","hgg","56"),
("152","Ertiga","fjk","23"),
("779","Etios","dfg","11"),
("241","Maruti","yui","76"),
("231","Benz","rtu","90");

alter table car add car_regno varchar(10);
