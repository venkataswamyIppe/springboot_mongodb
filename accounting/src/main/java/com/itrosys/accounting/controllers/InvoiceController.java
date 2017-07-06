package com.itrosys.accounting.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itrosys.accounting.model.Invoice;
import com.itrosys.accounting.model.InvoiceRequest;
import com.itrosys.accounting.services.InvoiceService;

@RestController
@RequestMapping(path = "/invoice")
public class InvoiceController {
	@Autowired
	private InvoiceService is;

	/**
	 * List all Invoice.
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{size}/{page}")
	public List<Invoice> getAllInvoice(@PathVariable("size") int size,@PathVariable("page") int page) {
		return is.getAllInvoices(size,page);

	}

	/**
	 * Retrieve the Invoice with the specified id.
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Invoice getByInvoiceId(@PathVariable("id") String id) {
		return is.getByInvoiceId(id);
	}

	/**
	 * add the Invoice
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public String addInvoice(@RequestBody InvoiceRequest invoiceRequest) {
		Invoice invoice = is.addInvoice(invoiceRequest);
		if (invoice != null) {
			return "invoice add successfully..";
		} else {
			return "invoice not added";
		}

	}

	/**
	 * delete the Invoice with the specified id.
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteInvoice(@PathVariable("id") String id) {
		is.deleteInvoice(id);
	}

	/**
	 * update the Invoice with the specified id.
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public void updateInvoice(@RequestBody Invoice invoice, @PathVariable String id) {
		is.updateInvoice(id, invoice);
	}

}
