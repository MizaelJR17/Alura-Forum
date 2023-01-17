-- SQLINES LICENSE FOR EVALUATION USE ONLY
create sequence resposta_seq;

create table resposta(
    id bigint not null default nextval ('resposta_seq'),
    mensagem varchar(300) not null,
    data_criacao timestamp(0) not null,
    topico_id bigint not null,
    autor_id bigint not null,
    solucao int not null,
    primary key(id),
    foreign key(topico_id) references topico(id),
    foreign key(autor_id) references usuario(id)
);