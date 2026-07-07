package org.example.entityservices.models;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "named_location")
public class NamedLocation extends BaseModel{



    @OneToOne
    private ExactLocation location;
    private String name;
    private String zipcode;
    private String city;
    private String country;
    private String state;


}
