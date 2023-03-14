use amitha;
create table rental(
	rental_id varchar(10),
	customer_id varchar(10),
	car_id varchar(10),
    pickup_date date,
    return_date date,
	km_driven int,
    fare_amount double(10,2),
	primary key(rental_id),
    foreign key(customer_id) references customer(customer_id),
    foreign key(car_id) references car(car_id)
);

insert into rental(rental_id,customer_id,car_id,pickup_date,return_date,km_driven,fare_amount)
values("R001","1","342","2018-03-10","2018-03-10","800","9000"),
("R002","2","123","2018-03-11","2018-03-12","200","3000"),
("R003","3","152","2018-04-15","2018-04-15","100","1500"),
("R004","4","779","2018-05-16","2018-05-18","1000","10000"),
("R005","5","241","2018-05-10","2018-05-12","900","11000"),
("R006","6","231","2018-05-20","2018-05-21","200","2500");



######################################################ANSWERS##################################################################################3
select car_id,car_name,car_type from car where car_id not in (select car_id from rental) order by car_id;
select car.car_id,car_name,car_type from car inner join rental where pickup_date = null;##or
select car_id,car_name,owner_id from car where car_type in ('fhh') order by car_id;
select car_id,car_name,car_type from car where car_type in ('yui') order by car_id;
SELECT c.owner_id, owner_name, address, phone_no FROM owner INNER JOIN car c on owner.owner_id=c.owner_id WHERE car_name IN ('Maruti') ORDER BY owner_id;
select rental_id,car_id,customer_id,km_driven from rental where return_date in ('2018-03-10') order by rental_id;
