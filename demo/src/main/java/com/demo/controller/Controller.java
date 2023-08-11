package com.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.demo.model.RecordByDateReq;
import com.demo.model.StoreItemRecordReq;
import com.demo.model.StoreItemRecordRes;
import com.demo.services.StoreItemRecordService;

@RestController
@RequestMapping("/shrikant")
public class Controller {

	@Autowired
	StoreItemRecordService storeItemRecordService;

	@RequestMapping(value="/storeData",method=RequestMethod.POST,produces= {"application/json"},
			consumes= {"application/json"})
	public ResponseEntity<StoreItemRecordRes> storeRecord(@RequestBody StoreItemRecordReq request){


		System.out.println("data--------- "+request.toString());
		StoreItemRecordRes result=null;
		try {
			if (request != null) {

				result = storeItemRecordService.saveData(request);

				System.out.println("result :  =====  " + result.toString());
			} else {
				result.setErrorCode("1");
				result.setMessage("please provide valid request");
			}
		}catch(Exception e){
			System.out.println("Exception : "+e.getLocalizedMessage());
			result.setErrorCode("1");
			result.setMessage("Exception : "+e.getLocalizedMessage());
		}

		return new ResponseEntity<StoreItemRecordRes>(result,HttpStatus.OK);
	}




	@RequestMapping(value="/getAllData",method=RequestMethod.GET,produces= {"application/json"},
			consumes= {"application/json"})
	public ResponseEntity<StoreItemRecordRes> getAllData(){
		StoreItemRecordRes result=null;
		try {
			result= storeItemRecordService.getAllData();

			System.out.println("result :  =====  "+result.toString());
		}catch(Exception e){
			result.setErrorCode("1");
			result.setMessage("Exception : "+e.getLocalizedMessage());
		}

		return new ResponseEntity<StoreItemRecordRes>(result,HttpStatus.OK);
	}



	@RequestMapping(value="/getRecordByDate",method=RequestMethod.GET,produces= {"application/json"},
			consumes= {"application/json"})
	public ResponseEntity<StoreItemRecordRes> getRecordByDate(@RequestBody RecordByDateReq req){

		StoreItemRecordRes result=null;
		try {

			if (req != null) {


				result= storeItemRecordService.getRecordByDate(req);

				System.out.println("result :  =====  "+result.toString());
			} else {
				result.setErrorCode("1");
				result.setMessage("please provide date in yyyy-mm-dd format");
			}
		}catch(Exception e){
			System.out.println("Exception : "+e.getLocalizedMessage());
			result.setErrorCode("1");
			result.setMessage("Exception : "+e.getLocalizedMessage());
		}

		return new ResponseEntity<StoreItemRecordRes>(result,HttpStatus.OK);
	}



}
