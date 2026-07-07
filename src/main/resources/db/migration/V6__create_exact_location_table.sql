CREATE TABLE exact_location (
                                id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                created_at DATETIME NOT NULL,
                                updated_at DATETIME,

                                latitude DOUBLE,
                                longitude DOUBLE
);

CREATE TABLE named_location (
                                id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                created_at DATETIME NOT NULL,
                                updated_at DATETIME,

                                location_id BIGINT UNIQUE,
                                name VARCHAR(255),
                                zipcode VARCHAR(255),
                                city VARCHAR(255),
                                country VARCHAR(255),
                                state VARCHAR(255),

                                CONSTRAINT fk_named_location_exact_location
                                    FOREIGN KEY (location_id)
                                        REFERENCES exact_location(id)
);