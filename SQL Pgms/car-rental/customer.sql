use amitha;
create table customer(
	customer_id varchar(10),
	customer_name varchar(20),
	address varchar(20),
	phone_no bigint,
	email_id varchar(20),
	primary key(customer_id)
);
insert into customer(customer_id,customer_name,address,phone_no,email_id)
values("1","Ameena","ffgg","9997788657","poio@mail.com"),
("2","Nazi","kkll","9446689005","wety@gmail.com"),
("3","Minnu","eerr","8886755441","fhj@gmail.com"),
("4","Devi","wwee","9090876522","et@gmail.com"),
("5","Akhi","qqww","7070896653","sddf@gmail.com"),
("6","Athul","ttyy","4343567689","df78@gmail.com");