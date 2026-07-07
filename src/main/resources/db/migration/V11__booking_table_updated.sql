ALTER TABLE bookings
    ADD COLUMN start_location_id BIGINT,
    ADD COLUMN end_location_id BIGINT;

ALTER TABLE bookings
    ADD CONSTRAINT fk_booking_start_location
        FOREIGN KEY (start_location_id)
            REFERENCES exact_location(id);

ALTER TABLE bookings
    ADD CONSTRAINT fk_booking_end_location
        FOREIGN KEY (end_location_id)
            REFERENCES exact_location(id);