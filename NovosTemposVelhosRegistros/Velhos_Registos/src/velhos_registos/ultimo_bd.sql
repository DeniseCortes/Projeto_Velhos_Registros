CREATE DATABASE ultimo_bd;
USE ultimo_bd;

CREATE TABLE aluno(
	cod_aluno int(5) NOT NULL,
    senha_aluno int(5) NOT NULL,
	nome varchar(50) NOT NULL,
	num_faltas int(3),
	atestas_medico varchar(50),
	ficha_medica varchar(50),
	PRIMARY KEY(cod_aluno)
);
CREATE TABLE professor(
	cod_prof int(5) NOT NULL,
    senha_prof int(5) NOT NULL,
	nome varchar(50) NOT NULL,
	ativ_ministrada varchar(30),
	carga_horaria int(4),
	PRIMARY KEY (cod_prof)
);
CREATE TABLE coordenador(
	nome varchar(50) NOT NULL,
	senha_coord int (5) NOT NULL,
	cod_coordenador int(5) NOT NULL,
	cod_turma int(2) NOT NULL,
	PRIMARY KEY (cod_coordenador)
);
CREATE TABLE turma(
	cod_turma int(2) NOT NULL,
	quant_alunos int(3),
	horario int(4),
	cod_aluno int(5)NOT NULL,
	cod_prof int(5) NOT NULL,
	PRIMARY KEY (cod_turma)
);
ALTER TABLE turma ADD FOREIGN KEY (cod_aluno) REFERENCES aluno(cod_aluno)ON DELETE CASCADE;
ALTER TABLE turma ADD FOREIGN KEY (cod_prof) REFERENCES professor(cod_prof)ON DELETE CASCADE;
ALTER TABLE coordenador ADD FOREIGN KEY (cod_coordenador) REFERENCES professor(cod_prof)ON DELETE CASCADE;

INSERT INTO aluno VALUES(1,2,"DENISE",0,"LDJBVBUO","ÇKENVLJNEVN");
INSERT INTO aluno VALUES(2,3,"MATT",20,"CEGO","DEMOLIDOR");
