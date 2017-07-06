package com.itrosys.accounting.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class FreightAmount {
	
	@Id
	private String id;
	private String custName;
	private String from_location;
	private String to_location;
	private FreightRate freightRate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getFrom_location() {
		return from_location;
	}
	public void setFrom_location(String from_location) {
		this.from_location = from_location;
	}
	public String getTo_location() {
		return to_location;
	}
	public void setTo_location(String to_location) {
		this.to_location = to_location;
	}
	public FreightRate getFreightRate() {
		return freightRate;
	}
	public void setFreightRate(FreightRate freightRate) {
		this.freightRate = freightRate;
	}

}
