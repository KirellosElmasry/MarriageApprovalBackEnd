package com.stmark.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stmark.model.SecondClearance;

@Repository
public interface SecondClearanceRepository  extends MongoRepository<SecondClearance, String>{
	
	public SecondClearance findByReferenceNumber(String referenceNumber);

}
