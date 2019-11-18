drop table role;
CREATE TABLE ROLE(
  role_id NUMBER(11) NOT NULL ENABLE,
  role varchar2(255) default NULL,
  PRIMARY KEY (role_id)
) 

drop table user_details;
CREATE TABLE  USER_DETAILS (
  id NUMBER(11) NOT NULL ENABLE,
  firstname varchar(255) NOT NULL,
  lastname varchar(255) NOT NULL,
  email varchar(255) NOT NULL,
  password varchar(255) NOT NULL,
  active NUMBER(11) default NULL,
  PRIMARY KEY  (id)
) 

DROP TABLE user_role;
CREATE TABLE  user_role (
  user_id NUMBER(11) NOT NULL,
  role_id NUMBER(11) NOT NULL,
  PRIMARY KEY  (user_id,role_id),
  CONSTRAINT user_userrole FOREIGN KEY (user_id) REFERENCES user_details (id),
  CONSTRAINT role_userrole FOREIGN KEY (role_id) REFERENCES role (role_id)
) 

DROP TABLE persistent_logins;
CREATE TABLE  persistent_logins (
   username varchar2(64) NOT NULL,
   series varchar2(64) NOT NULL,
  token varchar2(64) NOT NULL,
  last_used timestamp NOT NULL,
  PRIMARY KEY  (series)
)

INSERT INTO role VALUES (1,'ADMIN');