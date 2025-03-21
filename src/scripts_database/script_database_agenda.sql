CREATE DATABASE PROJETO_AGENDA;
USE PROJETO_AGENDA;

CREATE TABLE IF NOT EXISTS CLIENTE (
ID INT PRIMARY KEY AUTO_INCREMENT NOT NULL UNIQUE,
NOME VARCHAR (100) NOT NULL,
CPF VARCHAR (14) NOT NULL UNIQUE,
DATA_NASCIMENTO DATE NOT NULL,
ENDERECO VARCHAR (255)
);

CREATE TABLE IF NOT EXISTS CONTATO (
ID INT PRIMARY KEY AUTO_INCREMENT NOT NULL UNIQUE,
CLIENTE_ID INT,
TIPO VARCHAR (50) NOT NULL,
VALOR VARCHAR (100) NOT NULL,
OBSERVACAO VARCHAR (255),
FOREIGN KEY (CLIENTE_ID) REFERENCES CLIENTE (ID)
);