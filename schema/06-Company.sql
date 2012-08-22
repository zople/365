create table en_enterprise(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     main_sort  varchar(100),
     main_product  varchar(100),
     business_pattern varchar(100),
     logo  blob(225),
     primary key (id)
) 
//��ҵ��Ϣ
create table en_authentication(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     aptitude_certifications  varchar(100),
     integrity_certifications  varchar(100),
     description text(100),
     primary key (id)
)
//��ҵ��֤
create table en_recruitment(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     description text(100),
     primary key (id)
)
//�˲���Ƹ
create table en_news(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     description text(100),
     primary key (id)
)
//��ҵ����
create table en_exhibition(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     description text(100),
     primary key (id)
);
//����չ��

create table en_inquiry(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     description text(100),
     primary key (id)
);
//ѯ��
create table en_businessmen
(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     description text(100),
     flg int  (10),
     primary key (id)
);
//����
create table en_order
(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     description text(100),
     primary key (id)
);
//����
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
//����
create table en_premium
(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     description text(100),
     user_name varchar(100),
     user_id       int (10),
     primary key (id)
);
//��ֵ����
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
//�û��˻�

create table en_favorite
(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     description text(100),
     primary key (id)
);
//�ղؼ�

