/* Create New Database In Postgres */
CREATE DATABASE test;

/* Use The Newly Created Database To Create A Table */
USE test;

/* Create Table In Postgres */
CREATE TABLE users (id int(11) NOT NULL AUTO_INCREMENT, name varchar(20) NOT NULL, email varchar(30), country varchar(20), password varchar(20),PRIMARY KEY (id));

/* Insert Data Into Table */
INSERT INTO users (id, name,email,country,password) VALUES (1, 'John Doe','john@email.com','USA','pass123');
INSERT INTO users (id, name,email,country,password) VALUES (2, 'Monika','monika@email.com','UK','pass123');

/* Display Table Data */
SELECT * FROM users;

/* Display Table Structure */
DESC users;

