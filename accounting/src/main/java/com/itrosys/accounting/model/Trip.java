package com.itrosys.accounting.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Trip {
	@Id
	private String id;
	private String vehicle_number;
	private double quantity;
	private String toPartyName;
	private String toPartyAdd;
	private String toPartyContNo;
	private String fromPartyName;
	private String fromPartyAdd;
	private String fromPartyContNo;
	private String status;
	private String transportMat;
	private Date createdOn;
	private Date pickupDate;
	private Date deliveryDate;
	private String unit;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getVehicle_number() {
		return vehicle_number;
	}
	public void setVehicle_number(String vehicle_number) {
		this.vehicle_number = vehicle_number;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public String getToPartyName() {
		return toPartyName;
	}
	public void setToPartyName(String toPartyName) {
		this.toPartyName = toPartyName;
	}
	public String getToPartyAdd() {
		return toPartyAdd;
	}
	public void setToPartyAdd(String toPartyAdd) {
		this.toPartyAdd = toPartyAdd;
	}
	public String getToPartyContNo() {
		return toPartyContNo;
	}
	public void setToPartyContNo(String toPartyContNo) {
		this.toPartyContNo = toPartyContNo;
	}
	public String getFromPartyName() {
		return fromPartyName;
	}
	public void setFromPartyName(String fromPartyName) {
		this.fromPartyName = fromPartyName;
	}
	public String getFromPartyAdd() {
		return fromPartyAdd;
	}
	public void setFromPartyAdd(String fromPartyAdd) {
		this.fromPartyAdd = fromPartyAdd;
	}
	public String getFromPartyContNo() {
		return fromPartyContNo;
	}
	public void setFromPartyContNo(String fromPartyContNo) {
		this.fromPartyContNo = fromPartyContNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTransportMat() {
		return transportMat;
	}
	public void setTransportMat(String transportMat) {
		this.transportMat = transportMat;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getPickupDate() {
		return pickupDate;
	}
	public void setPickupDate(Date pickupDate) {
		this.pickupDate = pickupDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
