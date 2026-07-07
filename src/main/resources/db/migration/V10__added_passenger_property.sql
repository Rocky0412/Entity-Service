-- V7__add_active_booking_exact_location_and_rating_to_passengers.sql

ALTER TABLE passengers
    ADD COLUMN active_booking_id BIGINT,
    ADD COLUMN exact_location_id BIGINT,
    ADD COLUMN rating_average DOUBLE NOT NULL DEFAULT 0.0;

ALTER TABLE passengers
    ADD CONSTRAINT fk_passenger_active_booking
        FOREIGN KEY (active_booking_id)
            REFERENCES bookings(id);

ALTER TABLE passengers
    ADD CONSTRAINT fk_passenger_exact_location
        FOREIGN KEY (exact_location_id)
            REFERENCES exact_location(id);