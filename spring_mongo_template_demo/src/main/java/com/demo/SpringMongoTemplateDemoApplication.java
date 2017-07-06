package com.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.repository.PersonRepository;

@SpringBootApplication
public class SpringMongoTemplateDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonRepository personRepository = context.getBean(PersonRepository.class);

		// cleanup person collection before insertion
		personRepository.dropPersonCollection();
		// create person collection
		personRepository.createPersonCollection();
		//insert
		personRepository.insertPerson();
		//get
		personRepository.logAllPersons();
	}
}
