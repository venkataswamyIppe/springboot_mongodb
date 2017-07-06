package com.itrosys.accounting.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.itrosys.accounting.model.Trip;
import com.itrosys.accounting.repositories.TripRepository;


@Service
public class TripService {
	
	@Autowired
	private TripRepository tripRepository;

	// get all
	public List<Trip> getAllTrips(int size,int page) {
		Pageable pageableRequest = new PageRequest(page-1, size);
		Page<Trip> pageVariable=tripRepository.findAll(pageableRequest);
		List<Trip> trips = pageVariable.getContent();
		return trips;
	}

	// get by id
	public Trip getByTripId(String id) {
		return tripRepository.findOne(id);
	}

	// save
	public Trip addTrip(Trip trip) {
		return tripRepository.save(trip);
	}

	// delete
	public void deleteTrip(String id) {
		tripRepository.delete(id);
	}

	// update
	public void updateTrip(String id, Trip trip) {
		trip.setId(id);
		tripRepository.save(trip);

	}


}
