package com.itrosys.accounting.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.itrosys.accounting.model.LoadCharge;
import com.itrosys.accounting.repositories.LoadChargeRepository;

@Service
public class LoadChargeService {

	@Autowired
	private LoadChargeRepository loadChargeRepository;

	// get all
	public List<LoadCharge> getAllLoadCharges(int size, int page) {
		Pageable pageableRequest = new PageRequest(page - 1, size);
		Page<LoadCharge> pageVariable = loadChargeRepository.findAll(pageableRequest);
		List<LoadCharge> loadCharges = pageVariable.getContent();
		return loadCharges;
	}

	// get by id
	public LoadCharge getByLoadChargeId(String id) {
		return loadChargeRepository.findOne(id);
	}

	// save
	public LoadCharge addLoadCharge(LoadCharge loadCharge) {
		return loadChargeRepository.save(loadCharge);
	}

	// delete
	public void deleteLoadCharge(String id) {
		loadChargeRepository.delete(id);
	}

	// update
	public void updateLoadCharge(String id, LoadCharge loadCharge) {
		loadCharge.setId(id);
		loadChargeRepository.save(loadCharge);

	}

}
