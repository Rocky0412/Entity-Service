package org.example.entityservices.repositories;


import org.example.entityservices.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRespository extends JpaRepository<Booking, Long> {
    Booking findByReview_id(Long reviewId);
}
