package com.booking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import com.booking.model.Booking;

@Transactional
public interface  BookingRepository extends MongoRepository<Booking, String>{

	 public Booking findByDeparture(String departure);
}
