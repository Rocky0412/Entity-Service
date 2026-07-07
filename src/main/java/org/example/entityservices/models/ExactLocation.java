package org.example.entityservices.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "exact_location")
public class ExactLocation extends BaseModel{

    private double latitude;
    private double longitude;
}
