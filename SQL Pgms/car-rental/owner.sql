use amitha;
create table owner(
	owner_id varchar(10),
	owner_name varchar(20),
	address varchar(20),
	phone_no bigint,
	email_id varchar(20),
	primary key(owner_id)
);
insert into owner(owner_id,owner_name,address,phone_no,email_id)
values("78","Ami","abc","5334323565","fdssf2gmail.com"),
("56","Nami","bdc","9934323565","sadghssf2gmail.com"),
("23","Meenu","cde","7834323565","fgdvdsf2gmail.com"),
("11","Devika","efg","2434323565","cwfggdssf2gmail.com"),
("76","Akhil","ghi","99343278865","fsghesf2gmail.com"),
("90","Akhilesh","hij","8843278865","fsdghfssf2gmail.com");