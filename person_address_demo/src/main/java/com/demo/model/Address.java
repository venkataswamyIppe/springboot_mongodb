package com.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Address {
	
	private String country;
    private String state;
    private String city;
    
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
