package com.demo.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.StoreItemRecordEntity;
import com.demo.model.RecordByDateReq;
import com.demo.model.StoreItemRecordAllRes;
import com.demo.model.StoreItemRecordReq;
import com.demo.model.StoreItemRecordRes;
import com.demo.repository.StoreItemRecordRepo;

@Service
public class StoreItemRecordServiceImpl implements StoreItemRecordService {

	@Autowired
	StoreItemRecordRepo storeItemRecordRepo;

	@Override
	public StoreItemRecordRes saveData(StoreItemRecordReq request) {
		// TODO Auto-generated method stub
		StoreItemRecordRes response = new StoreItemRecordRes();

		try {
			StoreItemRecordEntity entity = new StoreItemRecordEntity(request.getItemName(), request.getAmount(),
					new Date());
			storeItemRecordRepo.save(entity);
			response.setErrorCode("0");
			response.setMessage("Record save successfully");
			System.out.println("done000000");
		} catch (Exception e) {
			// TODO: handle exception
			response.setErrorCode("1");
			response.setMessage("Exception : " + e.getLocalizedMessage());
		}
		return response;
	}

	@Override
	public StoreItemRecordRes getAllData() {
		// TODO Auto-generated method stub
		StoreItemRecordRes response = new StoreItemRecordRes();
		ArrayList<StoreItemRecordAllRes> tres = new ArrayList<>();
		StoreItemRecordAllRes tempResp = new StoreItemRecordAllRes();
		try {

			List<StoreItemRecordEntity> entityList = storeItemRecordRepo.findAll();

			for (StoreItemRecordEntity obj : entityList) {
				tempResp = new StoreItemRecordAllRes();
				tempResp.setAmount(obj.getAmount());
				tempResp.setDate(obj.getDate());
				tempResp.setItemName(obj.getItemName());

				tres.add(tempResp);

			}
			response.setItemRecord(tres);
			response.setErrorCode("0");
			response.setMessage("success");

		} catch (Exception e) {
			// TODO: handle exception
			response.setErrorCode("1");
			response.setMessage("Exception : " + e.getLocalizedMessage());
		}
		return response;
	}

	@Override
	public StoreItemRecordRes getRecordByDate(RecordByDateReq req) {
		// TODO Auto-generated method stub
		StoreItemRecordRes response = new StoreItemRecordRes();
		ArrayList<StoreItemRecordAllRes> tres = new ArrayList<>();
		StoreItemRecordAllRes tempResp = new StoreItemRecordAllRes();
		try {

			List<StoreItemRecordEntity> entityList = storeItemRecordRepo.getRecordsByDate(req.getDate());

			for (StoreItemRecordEntity obj : entityList) {
				tempResp = new StoreItemRecordAllRes();
				tempResp.setAmount(obj.getAmount());
				tempResp.setDate(obj.getDate());
				tempResp.setItemName(obj.getItemName());

				tres.add(tempResp);

			}
			response.setItemRecord(tres);
			response.setErrorCode("0");
			response.setMessage("success");

		} catch (Exception e) {
			// TODO: handle exception
			response.setErrorCode("1");
			response.setMessage("Exception : " + e.getLocalizedMessage());
		}
		return response;
	}

}
