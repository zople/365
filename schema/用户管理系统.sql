--用户权限管理
CREATE TABLE wj_user
(
  user_id bigint NOT NULL,
  user_name character varying(100) NOT NULL,
  CONSTRAINT wj_user_pkey PRIMARY KEY (user_id )
);
CREATE TABLE wj_roles
(
  roles_id bigint NOT NULL,
  roles_name character varying(100)[] NOT NULL,
  CONSTRAINT wj_roles_pkey PRIMARY KEY (roles_id )
);
CREATE TABLE wj_authority
(
  authority_id bigint NOT NULL,
  authority_flg character varying(100)[] NOT NULL,
  CONSTRAINT wj_authority_pkey PRIMARY KEY (authority_id )
);
CREATE TABLE wj_user_roles
(
  user_id bigint NOT NULL,
  roles_id bigint NOT NULL,
  CONSTRAINT wj_user_roles_pkey PRIMARY KEY (user_id , roles_id ),
  CONSTRAINT wj_user_roles_roles_id_fkey FOREIGN KEY (roles_id)
      REFERENCES wj_roles (roles_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT wj_user_roles_user_id_fkey FOREIGN KEY (user_id)
      REFERENCES wj_user (user_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);
CREATE TABLE wj_roles_authority
(
  roles_id bigint NOT NULL,
  authority_id bigint NOT NULL,
  CONSTRAINT wj_roles_authority_pkey PRIMARY KEY (roles_id , authority_id ),
  CONSTRAINT wj_roles_authority_authority_id_fkey FOREIGN KEY (authority_id)
      REFERENCES wj_authority (authority_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT wj_roles_authority_roles_id_fkey FOREIGN KEY (roles_id)
      REFERENCES wj_roles (roles_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);
--平台内容管理
CREATE TABLE wj_blogroll
(
  id bigint NOT NULL,
  name character varying(100),
  content character varying(100),
  description text,
  create_time date,
  CONSTRAINT wj_blogroll_pkey PRIMARY KEY (id )
);
CREATE TABLE wj_canvass_trader
(
  id bigint NOT NULL,
  trader_name character varying(100),
  factory_name character varying(100),
  description text,
  CONSTRAINT wj_canvass_trader_pkey PRIMARY KEY (id )
);
CREATE TABLE wj_category
(
  category_id bigint NOT NULL,
  father_id bigint NOT NULL,
  sort_order bigint,
  category_name character varying(100)[] NOT NULL,
  CONSTRAINT wj_category_pkey PRIMARY KEY (category_id )
);
CREATE TABLE wj_exhibition
(
  id bigint NOT NULL,
  name character varying(100),
  description text,
  CONSTRAINT wj_exhibition_pkey PRIMARY KEY (id )
);
CREATE TABLE wj_goods
(
  goods_id bigint NOT NULL,
  goods_name character varying(100)[] NOT NULL,
  goods_description text,
  goods_create_time date,
  goods_end_time date,
  state integer,
  category_id bigint NOT NULL,
  CONSTRAINT wj_goods_pkey PRIMARY KEY (goods_id )
);
CREATE TABLE wj_help
(
  id bigint NOT NULL,
  class_name character varying(100),
  name character varying(100),
  content character varying(100),
  description text,
  create_time date,
  CONSTRAINT wj_help_pkey PRIMARY KEY (id )
);

CREATE TABLE wj_image
(
  id bigint NOT NULL,
  class_name character varying(100),
  name character varying(100),
  url character varying(100),
  image bytea,
  description text,
  CONSTRAINT wj_image_pkey PRIMARY KEY (id )
);
CREATE TABLE wj_industry_news
(
  id bigint NOT NULL,
  class_name character varying(100),
  class_title character varying(100),
  content text,
  description text,
  CONSTRAINT wj_industry_news_pkey PRIMARY KEY (id )
);
CREATE TABLE wj_member
(
  member_id bigint NOT NULL DEFAULT 1,
  member_name character varying(100) NOT NULL,
  member_description text,
  member_create_time date NOT NULL,
  CONSTRAINT wj_member_pkey PRIMARY KEY (member_id ),
  CONSTRAINT wj_member_member_name_key UNIQUE (member_name )
);
CREATE TABLE wj_member_power
(
  id bigint NOT NULL DEFAULT 1,
  member_id bigint,
  power_id bigint,
  CONSTRAINT wj_member_power_pkey PRIMARY KEY (id )
);
CREATE TABLE wj_power
(
  power_id bigint NOT NULL DEFAULT 1,
  power_name character varying(100) NOT NULL,
  poer_content character varying(100),
  power_description text,
  power_create_time date NOT NULL,
  CONSTRAINT wj_power_pkey PRIMARY KEY (power_id ),
  CONSTRAINT wj_power_power_name_key UNIQUE (power_name )
);
CREATE TABLE wj_style
(
  id bigint NOT NULL,
  enterprise_style character varying(100),
  mall_style character varying(100),
  description text,
  CONSTRAINT wj_style_pkey PRIMARY KEY (id )
);
CREATE TABLE wj_supply
(
  supply_id bigint NOT NULL,
  name character varying(100),
  description text,
  CONSTRAINT wj_supply_pkey PRIMARY KEY (supply_id )
);



