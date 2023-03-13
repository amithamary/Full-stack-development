use amitha;
create table Company (
	city_name varchar(10),
    material_price int,
    price_without_material int
);
insert into Company (city_name,material_price,price_without_material) 
values("Tvm","1600","800"), ("Chennai","1800","1000"),("Hyderabad","2000","900"),("Mumbai","2500","1200"),("Kochi","1800","1200");
SELECT customers.id, customers.city, customers.square_feet, 
       construction_rates.rate_per_sqft * customers.square_feet AS total_amount
FROM customers 
INNER JOIN construction_rates 
ON customers.city = construction_rates.city;
