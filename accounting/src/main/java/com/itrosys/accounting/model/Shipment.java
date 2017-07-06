package com.itrosys.accounting.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Shipment {
	@Id
	private String id;
	private String toPartyName;
	private String toPartyAdd;
	private String toPartyContNo;
	private String fromPartyName;
	private String fromPartyAdd;
	private String fromPartyContNo;
	private String status;
	private String transportMat;
	private double quantity;
	private Date createdOn;
	private Date pickupDate;
	private Date deliveryDate;
	private String unit;
	private String customer_name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
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
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

}
