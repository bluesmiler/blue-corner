CREATE TABLE user
(
    id       VARCHAR(30) PRIMARY KEY,
    username VARCHAR(30) UNIQUE,
    password VARCHAR(30) NOT NULL,
    nickname VARCHAR(40) NOT NULL
);

INSERT INTO user (id, username, password, nickname)
VALUES ('D100000001', 'test', '123456', '宇宙无敌暴龙神');

CREATE TABLE article
(
    id        VARCHAR(30) PRIMARY KEY,
    title     VARCHAR(200) NOT NULL,
    content   TEXT,
    author_id VARCHAR(30)
);
ALTER TABLE article
    ADD CONSTRAINT fk_article_user_id FOREIGN KEY (author_id) REFERENCES user (id);
