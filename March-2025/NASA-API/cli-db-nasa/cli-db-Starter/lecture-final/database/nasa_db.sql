DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id serial PRIMARY KEY,
  username varchar(255) NOT NULL UNIQUE,     -- Username
  password varchar(32) NOT NULL,      -- Password (hashed, not plain-text)
  salt varchar(256) NOT NULL		  -- Password Salt
);

CREATE TABLE neo (
    db_id serial PRIMARY KEY,
    nasa_id varchar(255) NOT NULL,
    user_id int NOT NULL,
    neo_date DATE,
    neo_name varchar(255),
    hazardous boolean,
    min_diameter numeric (8, 8),
    max_diameter numeric (8, 8),
    CONSTRAINT FK_neo_users FOREIGN KEY (user_id)
      REFERENCES users(id)
);