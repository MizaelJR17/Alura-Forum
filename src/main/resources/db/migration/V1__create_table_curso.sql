-- SQLINES LICENSE FOR EVALUATION USE ONLY
create sequence curso_seq;

create table curso(
    id bigint not null default nextval ('curso_seq'),
    nome varchar(50) not null,
    categoria varchar(50) not null,
    primary key(id)
);

-- SQLINES LICENSE FOR EVALUATION USE ONLY
insert into curso values(1, 'Kotlin', 'Programacao');
-- SQLINES LICENSE FOR EVALUATION USE ONLY
insert into curso values(2, 'HTML', 'Front-end');