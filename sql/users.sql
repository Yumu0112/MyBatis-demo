DROP TABLE IF EXISTS users;

CREATE TABLE users (
id int unsigned AUTO_INCREMENT,
name VARCHAR(100) NOT NULL,
PRIMARY KEY(id)
);

INSERT INTO users (id, name) VALUES (1,'アーニャ');
INSERT INTO users (id, name) VALUES (2,'錦木千束');
INSERT INTO users (id, name) VALUES (3,'マーム');