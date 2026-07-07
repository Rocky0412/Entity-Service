package org.example.entityservices.models;


import jakarta.persistence.Entity;
import lombok.*;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OTP extends BaseModel{

    private String otp;
    private String sentToNumber;

    public static OTP generateOTP(String phoneNumber) {

        int random = ThreadLocalRandom.current().nextInt(1000, 10000);
        return OTP.builder()
                .otp(String.valueOf(random))
                .sentToNumber(phoneNumber)
                .build();


    }


}
