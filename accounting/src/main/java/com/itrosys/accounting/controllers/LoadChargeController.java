package com.itrosys.accounting.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itrosys.accounting.model.LoadCharge;
import com.itrosys.accounting.services.LoadChargeService;

@RestController
@RequestMapping(path = "/loadcharge")
public class LoadChargeController {

	@Autowired
	private LoadChargeService lcs;

	/**
	 * List all LoadCharges.
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{size}/{page}")
	public List<LoadCharge> getAllLoadCharges(@PathVariable("size") int size,@PathVariable("page") int page) {
		return lcs.getAllLoadCharges(size,page);

	}

	/**
	 * Retrieve the LoadCharge with the specified id.
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public LoadCharge getByLoadChargeId(@PathVariable("id") String id) {
		return lcs.getByLoadChargeId(id);
	}

	/**
	 * add the LoadCharge
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public void addLoadCharge(@RequestBody LoadCharge loadCharge) {
		lcs.addLoadCharge(loadCharge);

	}

	/**
	 * delete the LoadCharge with the specified id.
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deletePerson(@PathVariable("id") String id) {
		lcs.deleteLoadCharge(id);
	}

	/**
	 * update the LoadCharge with the specified id.
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public void updateLoadCharge(@RequestBody LoadCharge loadCharge, @PathVariable String id) {
		lcs.updateLoadCharge(id, loadCharge);
	}

}
