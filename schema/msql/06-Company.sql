create table en_enterprise(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     main_sort  varchar(100),
     main_product  varchar(100),
     business_pattern varchar(100),
     logo  blob(225),
     primary key (id)
) 
//企业信息
create table en_authentication(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     aptitude_certifications  varchar(100),
     integrity_certifications  varchar(100),
     description text(100),
     primary key (id)
)
//企业认证
create table en_recruitment(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     description text(100),
     primary key (id)
)
//人才招聘
create table en_news(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     description text(100),
     primary key (id)
)
//企业新闻
create table en_exhibition(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     description text(100),
     primary key (id)
);
//发布展会

create table en_inquiry(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     description text(100),
     primary key (id)
);
//询盘
create table en_businessmen
(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     description text(100),
     flg int  (10),
     primary key (id)
);
//商友
create table en_order
(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     description text(100),
     primary key (id)
);
//订单
create table en_storefront
(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     description text(100),
     phone blob(255),
     ad       text(255),
     logo    blob(255),
     style   text(255),
     primary key (id)
);
//店面
create table en_premium
(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     description text(100),
     user_name varchar(100),
     user_id       int (10),
     primary key (id)
);
//增值服务
create table en_user
(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     pwd    varchar(100),
     email    varchar(100),
     integral varchar(100),
     description text(100),
     primary key (id)
);
//用户账户

create table en_favorite
(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     description text(100),
     primary key (id)
);
//收藏夹

