CREATE DATABASE Jaegers;
\c jaegers; /* переходим в созданную базу Jaegers */
CREATE TABLE Jaegers (
    id SMALLSERIAL PRIMARY KEY,
    modelName TEXT NOT NULL,
    mark TEXT NOT NULL,
    height FLOAT(8),
    weight FLOAT(8),
    status TEXT NOT NULL,
    origin TEXT NOT NULL,
    launch DATE NOT NULL,
    kaijuKill INT
);