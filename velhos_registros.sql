CREATE DATABASE novo;
USE novo;

CREATE TABLE aluno(
cod_aluno int(5),
nome varchar(50),
cpf varchar(14),
num_faltas int(3),
atestas_medico varchar(50),
ficha_medica varchar(50),
PRIMARY KEY(cod_aluno)
);
CREATE TABLE professor(
cod_prof int(5),
nome varchar(50),
cpf varchar(14),
ativ_ministrada varchar(30),
carga_horaria int(4),
PRIMARY KEY (cod_prof)
);
CREATE TABLE coordenador(
nome varchar(50),
cpf varchar(14),
cod_coordenador int(5),
cod_turma int(2),
PRIMARY KEY (cod_coordenador)
);
CREATE TABLE turma(
cod_turma int(2),
quant_alunos int(3),
horario int(4),
cod_aluno int(5),
cod_prof int(5),
PRIMARY KEY (cod_turma)
);
ALTER TABLE turma ADD FOREIGN KEY (cod_aluno) REFERENCES aluno(cod_aluno);
ALTER TABLE turma ADD FOREIGN KEY (cod_prof) REFERENCES professor(cod_prof);
ALTER TABLE coordenador ADD FOREIGN KEY (cod_turma) REFERENCES turma(cod_turma);
ALTER TABLE coordenador ADD FOREIGN KEY (cod_coordenador) REFERENCES professor(cod_prof);

USE novo;
INSERT INTO aluno VALUES (1,"EU","73486784",999,"CEGUEIRA","DEMOLIDOR");
