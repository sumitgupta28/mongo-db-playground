package com.mongo.playground.documents;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.*;

import java.time.*;
import java.util.*;

@Getter
@Setter
@ToString(exclude = {"id", "dateOfBirth"})
@Document(collection = "people")
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class Person {

    @Id
    private String id;
    private String firstName;
    private String secondName;
    private LocalDateTime dateOfBirth;
    private Address address;
    private String profession;
    private int salary;
    private List<Hobby> hobbies;

    public Person(final String firstName, final String secondName, final LocalDateTime dateOfBirth,
                  final Address address, final String profession, final int salary, final List<Hobby> hobbies) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.profession = profession;
        this.salary = salary;
        this.hobbies = hobbies;
    }
}
