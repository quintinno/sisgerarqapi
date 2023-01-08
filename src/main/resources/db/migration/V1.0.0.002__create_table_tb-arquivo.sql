drop table if exists tb_arquivo;

create table if not exists tb_arquivo (
	codigo uuid not null unique,
	id_diretorio integer not null,
	id_pessoa uuid not null,
	nome varchar(100) not null,
	tamanho varchar(100) not null,
	data_criacao date not null,
	data_modificacao date null,
	extencao varchar(60) not null,
	url varchar(100) null,
	e_ativo boolean not null,
	constraint pk_arquivo primary key (codigo),
	constraint fk_diretorio foreign key (id_diretorio) references tb_diretorio (codigo)
);