package com.itrosys.accounting.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itrosys.accounting.model.Trip;
import com.itrosys.accounting.services.TripService;

@RestController
@RequestMapping(path = "/trip")
public class TripController {
	@Autowired
	private TripService ts;

	/**
	 * List all Trips.
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{size}/{page}")
	public List<Trip> getAllTrips(@PathVariable("size") int size,@PathVariable("page") int page) {
		return ts.getAllTrips(size,page);

	}

	/**
	 * Retrieve the Trip with the specified id.
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Trip getByTripId(@PathVariable("id") String id) {
		return ts.getByTripId(id);
	}

	/**
	 * add the Trip
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public void addTrip(@RequestBody Trip trip) {
		ts.addTrip(trip);

	}

	/**
	 * delete the LoadCharge with the specified id.
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteTrip(@PathVariable("id") String id) {
		ts.deleteTrip(id);
	}

	/**
	 * update the LoadCharge with the specified id.
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public void updateTrip(@RequestBody Trip trip, @PathVariable String id) {
		ts.updateTrip(id, trip);
	}

}
