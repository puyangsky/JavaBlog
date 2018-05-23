# article table DDL
CREATE TABLE article
(
  id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  title VARCHAR(255),
  content TEXT,
  author VARCHAR(255),
  publish_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);


# tag table DDL
CREATE TABLE tag
(
  id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  name VARCHAR(32) NOT NULL,
  article_num INT(11) DEFAULT '0'
);
CREATE UNIQUE INDEX name ON tag (name);
CREATE UNIQUE INDEX name_2 ON tag (name);


# article_tag_relationship table DDL
CREATE TABLE article_tag_relationship
(
  id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  article_id INT(11) NOT NULL,
  tag_id INT(11) NOT NULL
);

# user table DDL
CREATE TABLE user
(
  id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  username VARCHAR(32) NOT NULL,
  password VARCHAR(128),
  role VARCHAR(32)
);
CREATE UNIQUE INDEX username ON user (username);