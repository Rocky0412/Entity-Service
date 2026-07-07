package org.example.entityservices.models;

import jakarta.persistence.*;
import lombok.*;
import org.example.entityservices.models.Enums.BookingStatus;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bookings")
@Builder
public class Booking extends BaseModel{

    @OneToOne( cascade = {CascadeType.MERGE, CascadeType.PERSIST,CascadeType.REMOVE})
    @JoinColumn(name="review_id")
    private Review review;

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;

    private double price;

    private double totalDistance;

    private LocalDateTime startTime;

    private LocalDateTime endTime;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "driver_id")
    private Driver driver;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "passenger_id")
    private Passenger passenger;

    @OneToOne
    @JoinColumn(name = "start_location_id")
    private ExactLocation startLocation;

    @OneToOne
    @JoinColumn(name = "end_location_id")
    private ExactLocation endLocation;

}
