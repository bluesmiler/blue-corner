CREATE TABLE user
(
    id       INT(10) PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(30) UNIQUE NOT NULL,
    password VARCHAR(30)        NOT NULL,
    nickname VARCHAR(40)        NOT NULL,
    status   TINYINT(1)         NOT NULL DEFAULT 1
);

ALTER TABLE user
    AUTO_INCREMENT = 10000001;

INSERT INTO user (username, password, nickname)
VALUES ('test', '123456', '宇宙无敌暴龙神');

CREATE TABLE article
(
    id        VARCHAR(30) PRIMARY KEY,
    title     VARCHAR(200) NOT NULL,
    content   TEXT         NOT NULL,
    author_id INT(10)      NOT NULL,
    status    TINYINT(1)   NOT NULL DEFAULT 1,
    UNIQUE (author_id, title)
);
ALTER TABLE article
    ADD CONSTRAINT fk_article_user FOREIGN KEY (author_id) REFERENCES user (id);

CREATE TABLE `like`
(
    id         INT(10) AUTO_INCREMENT PRIMARY KEY,
    user_id    INT(10)     NOT NULL,
    article_id VARCHAR(30) NOT NULL,
    status     TINYINT(1)  NOT NULL
);

ALTER TABLE `like`
    ADD CONSTRAINT fk_like_user FOREIGN KEY (user_id) REFERENCES user (id);
ALTER TABLE `like`
    ADD CONSTRAINT fk_like_article FOREIGN KEY (article_id) REFERENCES article (id);
