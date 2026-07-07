package org.example.entityservices.models;


import jakarta.persistence.Entity;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DBConstant extends BaseModel {


    private String name;
    private String value;
}
