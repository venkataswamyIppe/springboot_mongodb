package com.itrosys.accounting.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.itrosys.accounting.model.Payment;

public interface PaymentRespository extends MongoRepository<Payment,String>{

}
