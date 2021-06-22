package com.mongo.playground.repository;

import com.mongo.playground.documents.*;
import org.springframework.data.mongodb.repository.*;

import java.util.*;

public interface PersonRepository extends MongoRepository<Person, String> {

    List<Person> findByFirstName(final String firstName);

    @Query("{'address.country': ?0}")
    List<Person> findByCountry(final String country);
}
