create table m_mall
(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     email   varchar(100),
     phone varchar(100),
     logo     blob(255),
     describes  text(100),
     primary key (id)
);
//��ó���û�������Ϣ
create table m_recruitment
(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     describes  text(100),
     primary key (id)
);
//��ó����֤
create table m_message(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     describes  text(100),
     primary key (id)
);
//��Ϣ����
create table m_mymall(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     describes  text(100),
     style   varchar(100),
     logo    blob,
     ad   text,
     primary key (id)
);
//�ҵ���ó��

create table m_merchants(
     id        int(20) not null  auto_increment,
     name  varchar(100),
     describes  text(100),
     primary key (id)
);
//��ס�̻���Ϣ