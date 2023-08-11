package com.demo.services;

import org.springframework.stereotype.Service;

import com.demo.model.RecordByDateReq;
import com.demo.model.StoreItemRecordReq;
import com.demo.model.StoreItemRecordRes;

@Service
public interface StoreItemRecordService {

	StoreItemRecordRes saveData(StoreItemRecordReq request);

	StoreItemRecordRes getAllData();

	StoreItemRecordRes getRecordByDate(RecordByDateReq req);

}
