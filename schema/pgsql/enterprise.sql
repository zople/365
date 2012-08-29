create table en_enterprise(
     id    bigint not null  ,
     name  varchar(100),
     main_sort  varchar(100),
     main_product  varchar(100),
     business_pattern varchar(100),
     logo  bytea,
     primary key (id)
) ;
--企业信息
create table en_authentication(
     id        bigint not null  ,
     name  varchar(100),
     aptitude_certifications  varchar(100),
     integrity_certifications  varchar(100),
     description text,
     primary key (id)
);
--企业认证
create table en_recruitment(
     id        bigint not null  ,
     name  varchar(100),
     description text,
     primary key (id)
);
--人才招聘
create table en_news(
     id        bigint not null  ,
     name  varchar(100),
     description text,
     primary key (id)
);
--企业新闻
create table en_exhibition(
     id        bigint not null  ,
     name  varchar(100),
     description text,
     primary key (id)
);
--发布展会

create table en_inquiry(
     id        bigint not null  ,
     name  varchar(100),
     description text,
     primary key (id)
);
--询盘
create table en_businessmen
(
     id        bigint not null  ,
     name  varchar(100),
     description text,
     flg  bigint,
     primary key (id)
);
--商友
create table en_order
(
     id        bigint not null  ,
     name  varchar(100),
     description text,
     primary key (id)
);
--订单
create table en_storefront
(
     id        bigint not null  ,
     name  varchar(100),
     description text,
     phone bytea,
     ad       text,
     logo    bytea,
     style   text,
     primary key (id)
);
--店面
create table en_premium
(
     id        bigint not null  ,
     name  varchar(100),
     description text,
     user_name varchar(100),
     user_id       bigint,
     primary key (id)
);
--增值服务
create table en_user
(
     id        bigint not null  ,
     name  varchar(100),
     pwd    varchar(100),
     email    varchar(100),
     integral varchar(100),
     description text,
     primary key (id)
);
--用户账户

create table en_favorite
(
     id        bigint not null  ,
     name  varchar(100),
     description text,
     primary key (id)
);
--收藏夹

