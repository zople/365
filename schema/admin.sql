
--�û�ע��
create table admin_register
(
     id     bigint not null  ,
     name varchar(100),  --ע���û���
     email  varchar(100),--ע������
     area    varchar(100),--ע�����
     ip    varchar(100),--ע��ip
     phone varchar(100),--ע��绰
     online_time date,  --����ʱ��
    create_time date,  --����ʱ��
     description text,
     primary key (id)
);
create table admin_catalogue
(
     id     bigint not null  ,
     class_name   varchar(100),
     parent_id   bigint,
     description text,
     level  bigint,--  ����ȼ������
     primary key (id)
);
--��Ʒ����
create table admin_producet
(
     id     bigint not null  ,
     name   varchar(100),
     description text,
     create_time date,  --��������
     end_time date,     --��ֹ����
     primary key (id)
);
--��Ʒ��Ϣ

create table admin_supply      
(
     id     bigint not null  ,
     user_id bigint, --��ԱID
     name   varchar(100),
     description text,
     primary key (id)
);
--������Ϣ

create table admin_canvass_trader      
(
     id     bigint not null  ,
     trader_name varchar(100),--��������
     factory_name varchar(100),--�ӹ���
     description text,
     primary key (id)
);
--������Ϣ

create table admin_industry_news      
(
     id     bigint not null  ,
     class_name  varchar(100),--��������
     class_title varchar(100),--��������
     content  text ,   --����
     description text,
     primary key (id)
);
--��ҵ��Ѷ
create table admin_message      
(
     id     bigint not null  ,
     name  varchar(100),--��ҵ����
     description text,
     primary key (id)
);
--��ó�ǻ�����Ϣ�����
create table admin_magazine 
(
     id     bigint not null  ,
     name  varchar(100),
     description text,
     primary key (id)
);
--��־����

create table admin_exhibition   
(
     id     bigint not null  ,
     name  varchar(100),--չʾ�Ĳ�Ʒ
     description text,
     primary key (id)
);
--չ����Ϣ
create table admin_image   
(
     id     bigint not null  ,
    class_name varchar(100),--�������
     name  varchar(100), --ͼƬ����
     url     varchar(100),  --ͼƬurl
     image bytea,  --ͼƬ
     description text,
     primary key (id)
);
--ͼ�����
create table admin_help  
(
     id     bigint not null  ,
     class_name varchar(100), --�����ĵ�����
     name  varchar(100),    --�����ĵ�����
     content    varchar(100),   --�����ĵ�����
     description text,
     create_time date,
     primary key (id)
);
--������Ϣ
create table admin_blogroll  
(
     id     bigint not null  ,
     name  varchar(100),   
     content    varchar(100),
     description text,
     create_time date,
     primary key (id)
);
--��������
create table admin_style  
(
     id     bigint not null  ,
     enterprise_style varchar(100), 
     mall_style  varchar(100), 
     description text,
     primary key (id)
);
--��վģ��

create table admin_spread 
(
     id     bigint not null  ,
     brand_name  varchar(100), 
     description text,
     primary key (id)
);
--�г��ƹ�,Ʒ��չʾ

create table admin_order
(
     id     bigint not null  ,
     name varchar(100),
     description text,
     primary key (id)
);
--����
create table admin_order_item
(
     id     bigint not null  ,
     order_id bigint,
     name varchar(100),
     description text,
     primary key (id)
);
--������







