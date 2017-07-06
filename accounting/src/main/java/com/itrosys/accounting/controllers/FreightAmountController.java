package com.itrosys.accounting.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itrosys.accounting.model.FreightAmount;
import com.itrosys.accounting.services.FreightAmountService;

@RestController
@RequestMapping(path = "/freightAmount")
public class FreightAmountController {
	
	@Autowired
	private FreightAmountService fas;

	/**
	 * List all FreightAmounts.
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{size}/{page}")
	public List<FreightAmount> getAllFreightAmounts(@PathVariable("size") int size,@PathVariable("page") int page) {
		return fas.getAllFreightAmounts(size,page);
	}

	/**
	 * Retrieve the FreightAmount with the specified id.
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public FreightAmount getByFreightAmountId(@PathVariable("id") String id) {
		return fas.getByFreightAmountId(id);
	}

	/**
	 * add the FreightAmount
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public void addFreightAmount(@RequestBody FreightAmount freightAmount) {
		fas.addFreightAmount(freightAmount);

	}

	/**
	 * delete the FreightAmount with the specified id.
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteFreightAmount(@PathVariable("id") String id) {
		fas.deleteFreightAmount(id);
	}

	/**
	 * update the LoadCharge with the specified id.
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public void updateFreightAmount(@RequestBody FreightAmount freightAmount, @PathVariable String id) {
		fas.updateFreightAmount(id, freightAmount);
	}


}
