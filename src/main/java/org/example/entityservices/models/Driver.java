package org.example.entityservices.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import lombok.*;
import org.example.entityservices.models.Enums.DriverApprovalStatus;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends BaseModel {
    String name;
    String surname;
    String LicenceNumber;
    private String password;
    @OneToMany(mappedBy = "driver", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    List<Booking> bookings;

    @JoinColumn(nullable = false)
    @OneToOne(mappedBy = "driver", cascade = CascadeType.ALL)
    private Car car;

    @Enumerated(EnumType.STRING)
    private DriverApprovalStatus driverApprovalStatus;

    @OneToOne
    private ExactLocation lastKnownLocation; // change over ther time

    private String activeCity;

    private Boolean isActive;


    @DecimalMax("5.0")
    @DecimalMin("1.0")
    private double avgRating;

    public void addBooking(Booking booking) {
        if(this.bookings == null) {
            this.bookings = new ArrayList<>();
        }
        this.bookings.add(booking);
        booking.setDriver(this);
    }
}


