package com.itrosys.accounting.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.itrosys.accounting.model.Trip;

public interface TripRepository extends MongoRepository<Trip, String>{

}
