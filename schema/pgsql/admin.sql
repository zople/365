
--用户注册
create table admin_register
(
     id     bigint not null  ,
     name varchar(100),  --注册用户名
     email  varchar(100),--注册邮箱
     area    varchar(100),--注册地区
     ip    varchar(100),--注册ip
     phone varchar(100),--注册电话
     online_time date,  --在线时间
    create_time date,  --创建时间
     description text,
     primary key (id)
);
create table admin_catalogue
(
     id     bigint not null  ,
     class_name   varchar(100),
     parent_id   bigint,
     description text,
     level  bigint,--  分类等级排序号
     primary key (id)
);
--产品分类
create table admin_producet
(
     id     bigint not null  ,
     name   varchar(100),
     description text,
     create_time date,  --生产日期
     end_time date,     --截止日期
     primary key (id)
);
--产品信息

create table admin_supply      
(
     id     bigint not null  ,
     user_id bigint, --会员ID
     name   varchar(100),
     description text,
     primary key (id)
);
--供求信息

create table admin_canvass_trader      
(
     id     bigint not null  ,
     trader_name varchar(100),--商人名称
     factory_name varchar(100),--加工厂
     description text,
     primary key (id)
);
--招商信息

create table admin_industry_news      
(
     id     bigint not null  ,
     class_name  varchar(100),--分类名称
     class_title varchar(100),--分类文章
     content  text ,   --内容
     description text,
     primary key (id)
);
--行业资讯
create table admin_message      
(
     id     bigint not null  ,
     name  varchar(100),--企业名称
     description text,
     primary key (id)
);
--商贸城基本信息管理表
create table admin_magazine 
(
     id     bigint not null  ,
     name  varchar(100),
     description text,
     primary key (id)
);
--杂志订阅

create table admin_exhibition   
(
     id     bigint not null  ,
     name  varchar(100),--展示的产品
     description text,
     primary key (id)
);
--展会信息
create table admin_image   
(
     id     bigint not null  ,
    class_name varchar(100),--所属类别
     name  varchar(100), --图片名称
     url     varchar(100),  --图片url
     image bytea,  --图片
     description text,
     primary key (id)
);
--图库管理
create table admin_help  
(
     id     bigint not null  ,
     class_name varchar(100), --帮助文档分类
     name  varchar(100),    --帮助文档名字
     content    varchar(100),   --帮助文档内容
     description text,
     create_time date,
     primary key (id)
);
--帮助信息
create table admin_blogroll  
(
     id     bigint not null  ,
     name  varchar(100),   
     content    varchar(100),
     description text,
     create_time date,
     primary key (id)
);
--友情链接
create table admin_style  
(
     id     bigint not null  ,
     enterprise_style varchar(100), 
     mall_style  varchar(100), 
     description text,
     primary key (id)
);
--网站模板

create table admin_spread 
(
     id     bigint not null  ,
     brand_name  varchar(100), 
     description text,
     primary key (id)
);
--市场推广,品牌展示

create table admin_order
(
     id     bigint not null  ,
     name varchar(100),
     description text,
     primary key (id)
);
--订单
create table admin_order_item
(
     id     bigint not null  ,
     order_id bigint,
     name varchar(100),
     description text,
     primary key (id)
);
--订单项







