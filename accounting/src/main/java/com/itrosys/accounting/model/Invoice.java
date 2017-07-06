package com.itrosys.accounting.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Invoice {
	@Id
	private String id;
	private String custName;
	private String custLocation;
	private Date created_on;
	private double quantity;
	private String unit;
	private String loadcharge;
	private String unloadcharge;
	private String freightcharge;
	private String hocharge;
	private String haltcharge;
	private String comp;
	/*private String addressee;*/
	private String description;

	private Trip trip;

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

	public String getCustLocation() {
		return custLocation;
	}

	public void setCustLocation(String custLocation) {
		this.custLocation = custLocation;
	}
	
	public Date getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getLoadcharge() {
		return loadcharge;
	}

	public void setLoadcharge(String loadcharge) {
		this.loadcharge = loadcharge;
	}

	public String getUnloadcharge() {
		return unloadcharge;
	}

	public void setUnloadcharge(String unloadcharge) {
		this.unloadcharge = unloadcharge;
	}

	public String getFreightcharge() {
		return freightcharge;
	}

	public void setFreightcharge(String freightcharge) {
		this.freightcharge = freightcharge;
	}

	public String getHocharge() {
		return hocharge;
	}

	public void setHocharge(String hocharge) {
		this.hocharge = hocharge;
	}

	public String getHaltcharge() {
		return haltcharge;
	}

	public void setHaltcharge(String haltcharge) {
		this.haltcharge = haltcharge;
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	/*public String getAddressee() {
		return addressee;
	}

	public void setAddressee(String addressee) {
		this.addressee = addressee;
	}*/

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}

}
