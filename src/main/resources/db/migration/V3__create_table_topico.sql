-- SQLINES LICENSE FOR EVALUATION USE ONLY
create sequence topico_seq;

create table topico(
    id bigint not null default nextval ('topico_seq'),
    titulo varchar(50) not null,
    mensagem varchar(300) not null,
    data_criacao timestamp(0) not null,
    status varchar(20) not null,
    curso_id bigint not null,
    autor_id bigint not null,
    primary key(id),
    foreign key(curso_id) references curso(id),
    foreign key(autor_id) references usuario(id)
);