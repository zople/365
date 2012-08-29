
#用户注册
create table admin_register
(
     id     int(20) not null  auto_increment,
     name varchar(100),  #注册用户名
     email  varchar(100),#注册邮箱
     area    varchar(100),#注册地区
     ip    varchar(100),#注册ip
     phone varchar(100),#注册电话
     online_time date,  #在线时间
    create_time date,  #创建时间
     description text(100),
     primary key (id)
);
create table admin_catalogue
(
     id     int(20) not null  auto_increment,
     class_name   varchar(100),
     parent_id   int(20),
     description text(100),
     level  int(10),#  分类等级排序号
     primary key (id)
);
#产品分类
create table admin_producet
(
     id     int(20) not null  auto_increment,
     name   varchar(100),
     description text(100),
     create_time date,  #生产日期
     end_time date,     #截止日期
     primary key (id)
);
#产品信息

create table admin_supply      
(
     id     int(20) not null  auto_increment,
     user_id int(20), #会员ID
     name   varchar(100),
     description text(100),
     primary key (id)
);
#供求信息

create table admin_canvass_trader      
(
     id     int(20) not null  auto_increment,
     trader_name varchar(100),#商人名称
     factory_name varchar(100),#加工厂
     description text(100),
     primary key (id)
);
#招商信息

create table admin_industry_news      
(
     id     int(20) not null  auto_increment,
     class_name  varchar(100),#分类名称
     class_title varchar(100),#分类文章
     content  text(500) ,   #内容
     description text(100),
     primary key (id)
);
#行业资讯
create table admin_message      
(
     id     int(20) not null  auto_increment,
     name  varchar(100),#企业名称
     description text(100),
     primary key (id)
);
#商贸城基本信息管理表
create table admin_magazine 
(
     id     int(20) not null  auto_increment,
     name  varchar(100),
     description text(100),
     primary key (id)
);
#杂志订阅

create table admin_exhibition   
(
     id     int(20) not null  auto_increment,
     name  varchar(100),#展示的产品
     description text(100),
     primary key (id)
);
#展会信息
create table admin_image   
(
     id     int(20) not null  auto_increment,
    class_name varchar(100),#所属类别
     name  varchar(100), #图片名称
     url     varchar(100),  #图片url
     image blob,  #图片
     description text(100),
     primary key (id)
);
#图库管理
create table admin_help  
(
     id     int(20) not null  auto_increment,
     class_name varchar(100), #帮助文档分类
     name  varchar(100),    #帮助文档名字
     content    varchar(100),   #帮助文档内容
     description text(100),
     create_time date,
     primary key (id)
);
#帮助信息
create table admin_blogroll  
(
     id     int(20) not null  auto_increment,
     name  varchar(100),   
     content    varchar(100),
     description text(100),
     create_time date,
     primary key (id)
);
#友情链接
create table admin_style  
(
     id     int(20) not null  auto_increment,
     enterprise_style varchar(100), 
     mall_style  varchar(100), 
     description text(100),
     primary key (id)
);
#网站模板

create table admin_spread 
(
     id     int(20) not null  auto_increment,
     brand_name  varchar(100), 
     description text(100),
     primary key (id)
);
#市场推广,品牌展示

create table admin_order
(
     id     int(20) not null  auto_increment,
     name varchar(100),
     description text(100),
     primary key (id)
);
#订单
create table admin_order_item
(
     id     int(20) not null  auto_increment,
     order_id int(20),
     name varchar(100),
     description text(100),
     primary key (id)
);
#订单项







