package com.demo.model;

import java.util.List;

public class StoreItemRecordRes {

private List<StoreItemRecordAllRes> itemRecord;
 private String message;
 private String errorCode;
public StoreItemRecordRes() {
	super();
	// TODO Auto-generated constructor stub
}
public StoreItemRecordRes(List<StoreItemRecordAllRes> itemRecord, String message, String errorCode) {
	super();
	this.itemRecord = itemRecord;
	this.message = message;
	this.errorCode = errorCode;
}
public List<StoreItemRecordAllRes> getItemRecord() {
	return itemRecord;
}
public void setItemRecord(List<StoreItemRecordAllRes> itemRecord) {
	this.itemRecord = itemRecord;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getErrorCode() {
	return errorCode;
}
public void setErrorCode(String errorCode) {
	this.errorCode = errorCode;
}
@Override
public String toString() {
	return "StoreItemRecordRes [itemRecord=" + itemRecord + ", message=" + message + ", errorCode=" + errorCode + "]";
}


 

}
