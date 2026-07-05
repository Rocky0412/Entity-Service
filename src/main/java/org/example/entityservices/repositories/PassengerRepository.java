package org.example.entityservices.repositories;


import org.example.entityservices.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
    Passenger findByEmail(String email) ;
}
