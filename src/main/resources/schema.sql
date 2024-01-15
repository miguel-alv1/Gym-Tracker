-- database schema for SQL tables

DROP TABLE IF EXISTS USERS;

CREATE TABLE USERS (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    user_email VARCHAR(50),
    gym_xp INT(8) NOT NULL
);