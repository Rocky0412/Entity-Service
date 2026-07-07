CREATE TABLE exact_location (
                                id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                created_at DATETIME NOT NULL,
                                updated_at DATETIME,

                                latitude DOUBLE,
                                longitude DOUBLE
);