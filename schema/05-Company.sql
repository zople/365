create table enterprise(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     main_sort  varchar(100),
     main_product  varchar(100),
     business_pattern varchar(100),
     logo  blob(225),
     primary key (id)
);
create table en_authentication(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     certifications  varchar(100),
     main_product  varchar(100),
     business_pattern varchar(100),
     logo  blob(225),
     primary key (id)
);