drop table if exists tb_diretorio;

create table if not exists tb_diretorio (
	codigo uuid not null unique,
	id_diretorio_pai uuid null,
	id_pessoa uuid not null, 
	nome varchar(100) not null,
	data_criacao timestamp not null,
	data_modificacao timestamp not null,
	tamanho integer not null,
	e_ativo boolean not null,
	constraint pk_diretorio primary key (codigo)
); 