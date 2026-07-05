CREATE TABLE reviews (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         created_at DATETIME NOT NULL,
                         updated_at DATETIME,

                         content VARCHAR(255) NOT NULL,
                         rating DOUBLE NOT NULL
);

CREATE TABLE passenger_review (
                                  id BIGINT PRIMARY KEY,

                                  passenger_comment VARCHAR(255),
                                  passenger_rating VARCHAR(255),

                                  CONSTRAINT fk_passenger_review_review
                                      FOREIGN KEY (id)
                                          REFERENCES reviews(id)
                                          ON DELETE CASCADE
);

CREATE TABLE driver (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        created_at DATETIME NOT NULL,
                        updated_at DATETIME,

                        name VARCHAR(255),
                        surname VARCHAR(255),
                        licence_number VARCHAR(255),
                        password VARCHAR(255)
);

CREATE TABLE passengers (
                            id BIGINT AUTO_INCREMENT PRIMARY KEY,
                            created_at DATETIME NOT NULL,
                            updated_at DATETIME,

                            first_name VARCHAR(255),
                            last_name VARCHAR(255),
                            email VARCHAR(255),
                            phone_number VARCHAR(255),
                            password VARCHAR(255)
);

CREATE TABLE bookings (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          created_at DATETIME NOT NULL,
                          updated_at DATETIME,

                          review_id BIGINT UNIQUE,
                          booking_status VARCHAR(255),
                          price DOUBLE,
                          total_distance DOUBLE,
                          start_time DATETIME,
                          end_time DATETIME,

                          driver_id BIGINT,
                          passenger_id BIGINT,

                          CONSTRAINT fk_booking_review
                              FOREIGN KEY (review_id)
                                  REFERENCES reviews(id),

                          CONSTRAINT fk_booking_driver
                              FOREIGN KEY (driver_id)
                                  REFERENCES driver(id),

                          CONSTRAINT fk_booking_passenger
                              FOREIGN KEY (passenger_id)
                                  REFERENCES passengers(id)
);