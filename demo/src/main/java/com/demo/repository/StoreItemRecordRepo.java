package com.demo.repository;

import java.util.Collection;
import java.util.List;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.entity.StoreItemRecordEntity;

public interface StoreItemRecordRepo extends JpaRepository<StoreItemRecordEntity,Long> {


	   @Query(value = "SELECT * FROM demo_db.store_item_record_entity where date(date)=:date", nativeQuery = true)
	   public List<StoreItemRecordEntity> getRecordsByDate(String date);
	
	
}
