package com.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StoreItemRecordEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "ITEMNAME")
	private String itemName;
	
	@Column(name="AMOUNT")
	private float amount;
	
	@Column(name="DATE")
	private Date date;

	public StoreItemRecordEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StoreItemRecordEntity( String itemName, float amount, Date date) {
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
		return "StoreItemRecordEntity [ itemName=" + itemName + ", amount=" + amount + ", date=" + date
				+ "]";
	}

	
}
