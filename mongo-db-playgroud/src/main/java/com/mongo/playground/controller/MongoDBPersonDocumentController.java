package com.mongo.playground.controller;

import com.mongo.playground.documents.*;
import com.mongo.playground.repository.*;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/persons")
@Api(description = "Set of endpoints for Curd Operations on Person Object.")
public class MongoDBPersonDocumentController {

    @Autowired
    PersonRepository personRepository;

    @PostMapping
    @ApiOperation(value = "Create a new person", notes = "Return 201 on Suceesful Creation")
    public ResponseEntity<Person> createTutorial(@RequestBody Person person) {
        try {
            Person _person = personRepository.save(person);
            return new ResponseEntity<>(_person, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
