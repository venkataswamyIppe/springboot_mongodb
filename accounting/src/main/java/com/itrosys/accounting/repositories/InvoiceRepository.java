package com.itrosys.accounting.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.itrosys.accounting.model.Invoice;

public interface InvoiceRepository extends MongoRepository<Invoice, String> {

}
