create database loja;

use loja;

create table cliente(
	cCodigo int,
	nome varchar(100),
	endereco varchar(100),
	fone int,
	primary key (cCodigo)
);

insert into cliente values (1,"KKu","BBB",16);
insert into cliente values (2,"Ediosa","SantazCruzes",17);