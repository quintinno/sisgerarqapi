drop table if exists tb_diretorio;

create table if not exists tb_diretorio (
	codigo uuid not null,
	id_diretorio_pai uuid null,
	id_pessoa uuid not null, 
	nome varchar(100) not null,
	data_criacao date not null,
	data_modificacao date not null,
	tamanho integer not null,
	e_ativo boolean not null
); 