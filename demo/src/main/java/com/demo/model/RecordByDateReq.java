package com.demo.model;

import java.util.Date;

public class RecordByDateReq {

	
	private String date;

	public RecordByDateReq() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecordByDateReq(String date) {
		super();
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "RecordByDateReq [date=" + date + "]";
	}

		
	
	
}
