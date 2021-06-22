package com.mongo.playground.documents;

import lombok.*;

@Getter
@Setter
@ToString
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class Address {

    private String addressLineOne;
    private String addressLineTwo;
    private String city;
    private String country;

}