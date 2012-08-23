create table en_enterprise(
     id    bigint not null  ,
     name  varchar(100),
     main_sort  varchar(100),
     main_product  varchar(100),
     business_pattern varchar(100),
     logo  bytea,
     primary key (id)
) ;
--��ҵ��Ϣ
create table en_authentication(
     id        bigint not null  ,
     name  varchar(100),
     aptitude_certifications  varchar(100),
     integrity_certifications  varchar(100),
     description text,
     primary key (id)
);
--��ҵ��֤
create table en_recruitment(
     id        bigint not null  ,
     name  varchar(100),
     description text,
     primary key (id)
);
--�˲���Ƹ
create table en_news(
     id        bigint not null  ,
     name  varchar(100),
     description text,
     primary key (id)
);
--��ҵ����
create table en_exhibition(
     id        bigint not null  ,
     name  varchar(100),
     description text,
     primary key (id)
);
--����չ��

create table en_inquiry(
     id        bigint not null  ,
     name  varchar(100),
     description text,
     primary key (id)
);
--ѯ��
create table en_businessmen
(
     id        bigint not null  ,
     name  varchar(100),
     description text,
     flg  bigint,
     primary key (id)
);
--����
create table en_order
(
     id        bigint not null  ,
     name  varchar(100),
     description text,
     primary key (id)
);
--����
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
--����
create table en_premium
(
     id        bigint not null  ,
     name  varchar(100),
     description text,
     user_name varchar(100),
     user_id       bigint,
     primary key (id)
);
--��ֵ����
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
--�û��˻�

create table en_favorite
(
     id        bigint not null  ,
     name  varchar(100),
     description text,
     primary key (id)
);
--�ղؼ�

