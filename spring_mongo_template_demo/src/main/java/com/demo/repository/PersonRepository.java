package com.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Person;

@Repository
public class PersonRepository {

	@Autowired
	MongoTemplate mongoTemplate;

	// get persons
	public void logAllPersons() {
		List<Person> results = mongoTemplate.findAll(Person.class);
	}

	// insert person info
	public void insertPerson() {
		Person p1 = new Person();
		p1.setName("John");
		p1.setAge(32);
		p1.setHomeTown("Hyderabad");
		mongoTemplate.insert(p1);
		Person p2 = new Person();
		p2.setName("Venkat");
		p2.setAge(21);
		p2.setHomeTown("Bangalore");
		mongoTemplate.insert(p2);
	}

	// Create a collection if the collection does not already exists
	public void createPersonCollection() {
		if (!mongoTemplate.collectionExists(Person.class)) {
			mongoTemplate.createCollection(Person.class);
		}
	}

	//Drops the collection if the collection does already exists
	public void dropPersonCollection() {
		if (mongoTemplate.collectionExists(Person.class)) {
			mongoTemplate.dropCollection(Person.class);
		}
	}
}
