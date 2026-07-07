CREATE TABLE color (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       created_at DATETIME NOT NULL,
                       updated_at DATETIME,

                       color VARCHAR(255)
);

CREATE TABLE car (
                     id BIGINT AUTO_INCREMENT PRIMARY KEY,
                     created_at DATETIME NOT NULL,
                     updated_at DATETIME,

                     color_id BIGINT,
                     plate_number VARCHAR(255) NOT NULL UNIQUE,
                     car_type ENUM('SEDAN', 'HATCHBACK', 'SUV'),
                     brand VARCHAR(255),
                     model VARCHAR(255),
                     driver_id BIGINT UNIQUE,

                     CONSTRAINT fk_car_color
                         FOREIGN KEY (color_id)
                             REFERENCES color(id),

                     CONSTRAINT fk_car_driver
                         FOREIGN KEY (driver_id)
                             REFERENCES driver(id)
);