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
--��ó���û�������Ϣ
create table m_recruitment
(
     id        bigint not null  ,
     name  varchar(100),
     describes  text,
     primary key (id)
);
--��ó����֤
create table m_message(
     id        bigint not null  ,
     name  varchar(100),
     describes  text,
     primary key (id)
);
--��Ϣ����
create table m_mymall(
     id        bigint not null  ,
     name  varchar(100),
     describes  text,
     style   varchar(100),
     logo    bytea,
     ad   text,
     primary key (id)
);
--�ҵ���ó��

create table m_merchant(
     id        bigint not null  ,
     name  varchar(100),
     describes  text,
     primary key (id)
);
--��ס�̻���Ϣ