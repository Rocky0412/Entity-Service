CREATE TABLE db_constant (
                             id BIGINT AUTO_INCREMENT PRIMARY KEY,
                             created_at DATETIME NOT NULL,
                             updated_at DATETIME,

                             name VARCHAR(255),
                             value VARCHAR(255)
);