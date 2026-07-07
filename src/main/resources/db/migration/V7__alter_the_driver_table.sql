ALTER TABLE driver
    ADD COLUMN driver_approval_status ENUM('APPROVED', 'REJECTED', 'PENDING');

ALTER TABLE driver
    ADD COLUMN last_known_location_id BIGINT UNIQUE;

ALTER TABLE driver
    ADD COLUMN active_city VARCHAR(255);

ALTER TABLE driver
    ADD COLUMN is_active BOOLEAN;

ALTER TABLE driver
    ADD CONSTRAINT fk_driver_last_known_location
        FOREIGN KEY (last_known_location_id)
            REFERENCES exact_location(id);