package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Person;
import com.demo.service.DemoService;

@RestController
@RequestMapping(path="/person")
public class DemoController {

	@Autowired
	DemoService ds;

	/**
	 * List all Persons.
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/all")
	public List<Person> getAllPersons() {
		System.out.println("getAllPersons");
		return ds.getAllPersons();

	}

	/**
	 * Retrieve the Person with the specified id.
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Person getByPersonId(@PathVariable("id") String id) {
		System.out.println("getByPersonId");
		return ds.getByPersonId(id);
	}

	/**
	 * add the Person
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public void addProduct(@RequestBody Person person) {
		System.out.println("addProduct");
		ds.addPerson(person);

	}

	/**
	 * delete the Person with the specified id.
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deletePerson(@PathVariable("id") String id) {
		System.out.println("deletePerson");
		ds.deletePerson(id);
	}

	/**
	 * update the Person with the specified id.
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public void updateProduct(@RequestBody Person person, @PathVariable String id) {
		System.out.println("updateProduct");
		ds.updatePerson(id, person);
	}

}
