create table user
(
    id       varchar(30) primary key,
    username varchar(30) unique,
    password varchar(30) not null,
    nickname varchar(40) not null
);

insert into user (id, username, password, nickname)
values ('D100000001', 'test', '123456', '宇宙无敌暴龙神');