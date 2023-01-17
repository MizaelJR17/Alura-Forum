-- SQLINES LICENSE FOR EVALUATION USE ONLY
create sequence usuario_seq;

create table usuario(
    id bigint not null default nextval ('usuario_seq'),
    nome varchar(50) not null,
    email varchar(50) not null,
    primary key(id)
);

-- SQLINES LICENSE FOR EVALUATION USE ONLY
insert into usuario values(1, 'Ana da Silva', 'ana@email.com');