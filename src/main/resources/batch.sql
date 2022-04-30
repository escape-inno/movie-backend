CREATE DATABASE IF NOT EXISTS batch;

USE batch;

CREATE TABLE IF NOT EXISTS company
(
    id           VARCHAR(36)       NOT NULL,
    code         VARCHAR(8) UNIQUE NOT NULL,
<<<<<<< master
    korea_name   VARCHAR(60),
    english_name VARCHAR(60),
    ceo_name     VARCHAR(60),
=======
    korea_name   VARCHAR(100),
    english_name VARCHAR(100),
    ceo_name     VARCHAR(100),
>>>>>>> chore: box_office ddl 작성
    created_at   TIMESTAMP              DEFAULT CURRENT_TIMESTAMP,
    updated_at   TIMESTAMP         NULL DEFAULT NULL,
    primary key (id),
    INDEX idx_created_at (created_at)
) ENGINE = InnoDB
<<<<<<< master
=======
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS box_office
(
    id          VARCHAR(36) NOT NULL,
    movie_id    VARCHAR(36),
    ranking     VARCHAR(10),
    ranked_date VARCHAR(10),
    created_at  TIMESTAMP        DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP   NULL DEFAULT NULL,
    primary key (id),
    INDEX idx_created_at (created_at)
) ENGINE = InnoDB
>>>>>>> chore: box_office ddl 작성
  DEFAULT CHARSET = utf8;