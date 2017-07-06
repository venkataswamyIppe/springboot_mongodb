package com.itrosys.accounting.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.itrosys.accounting.model.LoadCharge;

public interface LoadChargeRepository extends MongoRepository<LoadCharge,String>{

}
