package org.example.entityservices.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Color extends BaseModel{
    private String color;

    @OneToMany(mappedBy = "color", cascade = CascadeType.ALL)
    @Fetch(FetchMode.SUBSELECT)

    List<Car> cars;

}
