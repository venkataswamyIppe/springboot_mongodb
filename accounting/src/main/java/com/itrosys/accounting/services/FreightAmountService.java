package com.itrosys.accounting.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.itrosys.accounting.model.FreightAmount;
import com.itrosys.accounting.repositories.FreightAmountRepository;

@Service
public class FreightAmountService {

	@Autowired
	private FreightAmountRepository freightAmountRepository;

	// get all
	public List<FreightAmount> getAllFreightAmounts(int size, int page) {
		Pageable pageableRequest = new PageRequest(page-1, size);
		Page<FreightAmount> pageVariable = freightAmountRepository.findAll(pageableRequest);
		List<FreightAmount> freightAmounts = pageVariable.getContent();
		return freightAmounts;

	}

	// get by id
	public FreightAmount getByFreightAmountId(String id) {
		return freightAmountRepository.findOne(id);
	}

	// save
	public FreightAmount addFreightAmount(FreightAmount freightAmount) {
		return freightAmountRepository.save(freightAmount);
	}

	// delete
	public void deleteFreightAmount(String id) {
		freightAmountRepository.delete(id);
	}

	// update
	public void updateFreightAmount(String id, FreightAmount freightAmount) {
		freightAmount.setId(id);
		freightAmountRepository.save(freightAmount);

	}

}
