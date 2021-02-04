--psql -U postgres --file=create_db.sql

CREATE DATABASE Jaegers;

\c jaegers;

CREATE TABLE Jaegers (
    id SERIAL PRIMARY KEY,
    modelName TEXT,
    mark CHAR(6),
    height REAL,
    weight REAL,
    status TEXT,
    origin TEXT,
    kaijuKill INTEGER,
    launch DATE)
;
