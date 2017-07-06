package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Criteria;
import com.demo.bean.Car;

@RestController
@RequestMapping(path = "/car")
public class CarController {

	@Autowired
	MongoTemplate mongoTemplate;

	// get all
	@RequestMapping("/all")
	public List<Car> getAllCars() {
		return mongoTemplate.findAll(Car.class);
	}

	// get by id
	
	@RequestMapping("/{id}")
	public Car getCarById(@PathVariable("id") String id) {
		Car car = new Car();
		car.setId(id);
		Query query = new Query(Criteria.where("_id").is(car.getId()));
		return mongoTemplate.findOne(query, Car.class);
	}
	
	//add
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void create(@RequestBody Car car) {
		mongoTemplate.insert(car);
	}
	
	// delete by car id
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") String id) {
		Car car=new Car();
		car.setId(id);
		mongoTemplate.remove(car);
	}
	
	//update by car id
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable("id") String id,@RequestBody Car car) {
		car.setId(id);
		mongoTemplate.save(car);
	}
}
		