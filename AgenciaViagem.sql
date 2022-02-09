create database AgenciaViagem;

use AgenciaViagem;

create table Destino (
	id_destino integer primary key auto_increment,
    uf char(2) not null,
    cidade varchar(60) not null,
    preco varchar(7) not null,
    url_imagem varchar(50) not null	
);

create table Promocao (
	id_promocao integer primary key auto_increment,
    descricao varchar(100),
    percentual_desconto decimal(10,2) not null
);

create table Contato (
	id_contato integer primary key auto_increment,
    nome varchar(45) not null,
    email varchar(50) not null,
    mensagem varchar(300) not null
);