CREATE TABLE otp (
                     id BIGINT AUTO_INCREMENT PRIMARY KEY,
                     created_at DATETIME NOT NULL,
                     updated_at DATETIME,

                     otp VARCHAR(255),
                     sent_to_number VARCHAR(255)
);