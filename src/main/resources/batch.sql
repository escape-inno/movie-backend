CREATE DATABASE IF NOT EXISTS batch;

USE batch;

CREATE TABLE IF NOT EXISTS company
(
    id           VARCHAR(36)       NOT NULL,
    code         VARCHAR(8) UNIQUE NOT NULL,
    korea_name   VARCHAR(60),
    english_name VARCHAR(60),
    ceo_name     VARCHAR(60),
    created_at   TIMESTAMP              DEFAULT CURRENT_TIMESTAMP,
    updated_at   TIMESTAMP         NULL DEFAULT NULL,
    primary key (id),
    INDEX idx_created_at (created_at)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;