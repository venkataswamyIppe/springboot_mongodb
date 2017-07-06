package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Person;
import com.demo.repository.DemoRepository;

@Service
public class DemoService {

	@Autowired
	private DemoRepository demoRepository;

	// get all
	public List<Person> getAllPersons() {
		List<Person> persons = new ArrayList<>();
		demoRepository.findAll().forEach(persons::add);
		return persons;

	}

	// get by id
	public Person getByPersonId(String id) {
		return demoRepository.findOne(id);
	}

	// save
	public Person addPerson(Person person) {
		return demoRepository.save(person);
	}

	// delete
	public void deletePerson(String id) {
		demoRepository.delete(id);
	}

	// update
	public void updatePerson(String id, Person person) {
		person.setId(id);
		demoRepository.save(person);

	}

}
