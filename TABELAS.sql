CREATE TABLE TBFISCAL(
CPF VARCHAR2(11) PRIMARY KEY NOT NULL,
NOME VARCHAR(30),
ENDERECO VARCHAR(40),
TELEFONE VARCHAR(12),
EMAIL VARCHAR(30),
CODIGO NUMBER(5,0)
);

CREATE TABLE TBCANDIDATO(
CPF VARCHAR2(11) PRIMARY KEY NOT NULL,
INSCRICAO VARCHAR2(11) NOT NULL,
NOME VARCHAR(30),
ENDERECO VARCHAR(40),
TELEFONE VARCHAR(12),
EMAIL VARCHAR(30),
CODIGO NUMBER(5,0),
MEDIA NUMBER(2,2)
);