
#�û�ע��
create table admin_register
(
     id     int(20) not null  auto_increment,
     name varchar(100),  #ע���û���
     email  varchar(100),#ע������
     area    varchar(100),#ע�����
     ip    varchar(100),#ע��ip
     phone varchar(100),#ע��绰
     online_time date,  #����ʱ��
    create_time date,  #����ʱ��
     description text(100),
     primary key (id)
);
create table admin_catalogue
(
     id     int(20) not null  auto_increment,
     class_name   varchar(100),
     parent_id   int(20),
     description text(100),
     level  int(10),#  ����ȼ������
     primary key (id)
);
#��Ʒ����
create table admin_producet
(
     id     int(20) not null  auto_increment,
     name   varchar(100),
     description text(100),
     create_time date,  #��������
     end_time date,     #��ֹ����
     primary key (id)
);
#��Ʒ��Ϣ

create table admin_supply      
(
     id     int(20) not null  auto_increment,
     user_id int(20), #��ԱID
     name   varchar(100),
     description text(100),
     primary key (id)
);
#������Ϣ

create table admin_canvass_trader      
(
     id     int(20) not null  auto_increment,
     trader_name varchar(100),#��������
     factory_name varchar(100),#�ӹ���
     description text(100),
     primary key (id)
);
#������Ϣ

create table admin_industry_news      
(
     id     int(20) not null  auto_increment,
     class_name  varchar(100),#��������
     class_title varchar(100),#��������
     content  text(500) ,   #����
     description text(100),
     primary key (id)
);
#��ҵ��Ѷ
create table admin_message      
(
     id     int(20) not null  auto_increment,
     name  varchar(100),#��ҵ����
     description text(100),
     primary key (id)
);
#��ó�ǻ�����Ϣ�����
create table admin_magazine 
(
     id     int(20) not null  auto_increment,
     name  varchar(100),
     description text(100),
     primary key (id)
);
#��־����

create table admin_exhibition   
(
     id     int(20) not null  auto_increment,
     name  varchar(100),#չʾ�Ĳ�Ʒ
     description text(100),
     primary key (id)
);
#չ����Ϣ
create table admin_image   
(
     id     int(20) not null  auto_increment,
    class_name varchar(100),#�������
     name  varchar(100), #ͼƬ����
     url     varchar(100),  #ͼƬurl
     image blob,  #ͼƬ
     description text(100),
     primary key (id)
);
#ͼ�����
create table admin_help  
(
     id     int(20) not null  auto_increment,
     class_name varchar(100), #�����ĵ�����
     name  varchar(100),    #�����ĵ�����
     content    varchar(100),   #�����ĵ�����
     description text(100),
     create_time date,
     primary key (id)
);
#������Ϣ
create table admin_blogroll  
(
     id     int(20) not null  auto_increment,
     name  varchar(100),   
     content    varchar(100),
     description text(100),
     create_time date,
     primary key (id)
);
#��������
create table admin_style  
(
     id     int(20) not null  auto_increment,
     enterprise_style varchar(100), 
     mall_style  varchar(100), 
     description text(100),
     primary key (id)
);
#��վģ��

create table admin_spread 
(
     id     int(20) not null  auto_increment,
     brand_name  varchar(100), 
     description text(100),
     primary key (id)
);
#�г��ƹ�,Ʒ��չʾ

create table admin_order
(
     id     int(20) not null  auto_increment,
     name varchar(100),
     description text(100),
     primary key (id)
);
#����
create table admin_order_item
(
     id     int(20) not null  auto_increment,
     order_id int(20),
     name varchar(100),
     description text(100),
     primary key (id)
);
#������







