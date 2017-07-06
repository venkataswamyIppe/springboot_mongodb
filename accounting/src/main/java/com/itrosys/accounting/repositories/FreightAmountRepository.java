package com.itrosys.accounting.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.itrosys.accounting.model.FreightAmount;

public interface FreightAmountRepository extends MongoRepository<FreightAmount,String>{

}
