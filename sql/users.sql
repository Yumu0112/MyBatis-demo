DROP TABLE IF EXISTS users;

CREATE TABLE users (
id int unsigned AUTO_INCREMENT,
name VARCHAR(100) NOT NULL,
PRIMARY KEY(id)
);

INSERT INTO users (id, name) VALUES (1,'user01');
INSERT INTO users (id, name) VALUES (2,'user02');
INSERT INTO users (id, name) VALUES (3,'user03');
