create table user
(
    username varchar(40) primary key,
    password varchar(40),
    nickname varchar(255) unique
);

insert into user (username, password, nickname)
values (123456,123456,'蔡坤坤'),(7654321,7654321,'宇宙无敌暴龙神');
