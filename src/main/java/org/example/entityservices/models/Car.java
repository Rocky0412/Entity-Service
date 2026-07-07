package org.example.entityservices.models;


import jakarta.persistence.*;
import lombok.*;
import org.example.entityservices.models.Enums.CarType;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Car extends BaseModel{

    @ManyToOne(fetch = FetchType.LAZY)
    private Color color;

    @Column(nullable = false, unique = true)
    private String plateNumber;

    @Enumerated(EnumType.STRING)
    private CarType carType;

    private String brand;
    private String model;
    @OneToOne
    private Driver driver;

}
