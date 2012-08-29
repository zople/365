create table m_mall
(
     id        bigint not null  ,
     name  varchar(100),
     email   varchar(100),
     phone varchar(100),
     logo     bytea,
     describes  text,
     primary key (id)
);
--商贸城用户基本信息
create table m_recruitment
(
     id        bigint not null  ,
     name  varchar(100),
     describes  text,
     primary key (id)
);
--商贸城认证
create table m_message(
     id        bigint not null  ,
     name  varchar(100),
     describes  text,
     primary key (id)
);
--信息发布
create table m_mymall(
     id        bigint not null  ,
     name  varchar(100),
     describes  text,
     style   varchar(100),
     logo    bytea,
     ad   text,
     primary key (id)
);
--我的商贸城

create table m_merchant(
     id        bigint not null  ,
     name  varchar(100),
     describes  text,
     primary key (id)
);
--入住商户信息