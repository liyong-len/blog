CREATE TABLE `blog`.`m_user`
(
    `id`         bigint(20) NOT NULL AUTO_INCREMENT,
    `username`   varchar(64)  DEFAULT NULL,
    `avatar`     varchar(255) DEFAULT NULL,
    `email`      varchar(64)  DEFAULT NULL,
    `password`   varchar(64)  DEFAULT NULL,
    `status`     int(5)     NOT NULL,
    `created`    datetime     DEFAULT NULL,
    `last_login` datetime     DEFAULT NULL,
    PRIMARY KEY (`id`),
    KEY `UK_USERNAME` (`username`) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
CREATE TABLE `blog`.`m_blog`
(
    `id`          bigint(20)   NOT NULL AUTO_INCREMENT,
    `user_id`     bigint(20)   NOT NULL,
    `title`       varchar(255) NOT NULL,
    `description` varchar(255) NOT NULL,
    `content`     longtext,
    `created`     TIMESTAMP    NOT NULL ON UPDATE CURRENT_TIMESTAMP,
    `status`      tinyint(4) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;
