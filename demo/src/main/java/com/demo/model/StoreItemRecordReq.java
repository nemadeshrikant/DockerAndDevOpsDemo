package com.demo.model;

public class StoreItemRecordReq {
	
	
	private String itemName;
	private float amount;
	public StoreItemRecordReq() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StoreItemRecordReq(String itemName, float amount) {
		super();

		this.itemName = itemName;
		this.amount = amount;
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
	@Override
	public String toString() {
		return "StoreItemRecordReq [ itemName=" + itemName + ", amount=" + amount + "]";
	}
	
	

}
