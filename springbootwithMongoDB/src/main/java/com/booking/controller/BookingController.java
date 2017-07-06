package com.booking.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.booking.model.Booking;
import com.booking.repository.BookingRepository;

@RestController
@RequestMapping("/booking")
public class BookingController {
	
	 @Autowired
	private  BookingRepository bookingRepository;
	 
	 @RequestMapping(value="/create",method = RequestMethod.POST)
	 public Map<String, Object> create(Booking booking) {
		 System.out.println("create method caling");
	  booking.setTravelDate(new Date());
	  booking = (Booking) bookingRepository.save(booking);
	  Map<String, Object> dataMap = new HashMap<String, Object>();
	  dataMap.put("message", "Booking created successfully");
	  dataMap.put("status", "1");
	  dataMap.put("booking", booking);
	     return dataMap;
	 }
	 
	 /**
	  * GET /read  --> Read a booking by booking id from the database.
	  */
	 @RequestMapping(value="/read",method = RequestMethod.GET)
	 public Map<String, Object> read(@RequestParam String bookingId) {
		 System.out.println("read method caling");
	  Booking booking = (Booking) bookingRepository.findOne(bookingId);
	  Map<String, Object> dataMap = new HashMap<String, Object>();
	  dataMap.put("message", "Booking found successfully");
	  dataMap.put("status", "1");
	  dataMap.put("booking", booking);
	     return dataMap;
	 }
	 
	 /**
	  * GET /update  --> Update a booking record and save it in the database.
	  */
	 @RequestMapping("/update")
	 public Map<String, Object> update(@RequestParam String bookingId, @RequestParam String psngrName) {
	  Booking booking = (Booking) bookingRepository.findOne(bookingId);
	  booking.setPsngrName(psngrName);
	  booking = (Booking) bookingRepository.save(booking);
	  Map<String, Object> dataMap = new HashMap<String, Object>();
	  dataMap.put("message", "Booking updated successfully");
	  dataMap.put("status", "1");
	  dataMap.put("booking", booking);
	     return dataMap;
	 }
	 
	 /**
	  * GET /delete  --> Delete a booking from the database.
	  */
	 @RequestMapping("/delete")
	 public Map<String, Object> delete(@RequestParam String bookingId) {
	  bookingRepository.delete(bookingId);
	  Map<String, Object> dataMap = new HashMap<String, Object>();
	  dataMap.put("message", "Booking deleted successfully");
	  dataMap.put("status", "1");
	     return dataMap;
	 }
	 

}
