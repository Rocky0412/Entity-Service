package org.example.entityservices.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="passengers")
@Builder
public class Passenger extends BaseModel{
     private String firstName;
     private String lastName;
     private String email;
     private String phoneNumber;
     private String password;

     @OneToMany(mappedBy = "passenger", fetch = FetchType.LAZY,
             cascade = {CascadeType.MERGE, CascadeType.PERSIST})
     List<Booking> bookings;

     @OneToOne
     @JoinColumn(name = "active_booking_id")
     private Booking activeBooking;

     @OneToOne
     @JoinColumn(name = "exact_location_id")
     private ExactLocation exactLocation;

     private double ratingAverage;


     public void addBooking(Booking booking) {
          if (bookings == null) {
               bookings = new ArrayList<>();
          }
          this.bookings.add(booking);
          booking.setPassenger(this);
     }

}
