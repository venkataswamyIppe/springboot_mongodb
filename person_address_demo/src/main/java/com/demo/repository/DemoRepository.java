package com.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.model.Person;

public interface DemoRepository extends MongoRepository<Person, String> {

}
