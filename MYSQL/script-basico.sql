create database aula;
use aula;
create table pessoa (
	id int auto_increment PRIMARY KEY,
    nome varchar(255) not null,
    email varchar(255) not null unique
);

SELECT * FROM pessoa;

insert into pessoa (nome,email) VALUES ("Thiago", "thiago@thiago.com");
insert into pessoa (nome,email) VALUES ("teste", "teste@teste.com");

delete from pessoa where id = 2;