package com.demo.model;

import java.util.Date;

import javax.persistence.Column;

public class StoreItemRecordAllRes {


	
	private String itemName;
	
	private float amount;
	private Date date;
	public StoreItemRecordAllRes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StoreItemRecordAllRes( String itemName, float amount, Date date) {
		super();
		this.itemName = itemName;
		this.amount = amount;
		this.date = date;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "StoreItemRecordAllRes [ itemName=" + itemName + ", amount=" + amount + ", date=" + date
				+ "]";
	}
	
	
	
}
