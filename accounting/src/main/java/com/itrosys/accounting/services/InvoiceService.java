package com.itrosys.accounting.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.itrosys.accounting.model.Invoice;
import com.itrosys.accounting.model.InvoiceRequest;
import com.itrosys.accounting.model.Trip;
import com.itrosys.accounting.repositories.InvoiceRepository;
import com.itrosys.accounting.repositories.TripRepository;

@Service
public class InvoiceService {

	@Autowired
	private InvoiceRepository invoiceRepository;
	@Autowired
	private TripRepository tripRepository;

	// get all
	public List<Invoice> getAllInvoices(int size, int page) {
		Pageable pageableRequest = new PageRequest(page - 1, size);
		Page<Invoice> pageVariable = invoiceRepository.findAll(pageableRequest);
		List<Invoice> invoice = pageVariable.getContent();
		return invoice;
	}

	// get by id
	public Invoice getByInvoiceId(String id) {
		Invoice invoice = invoiceRepository.findOne(id);
		return invoice;
	}

	// save
	public Invoice addInvoice(InvoiceRequest invoiceRequest) {
		Invoice invoice = new Invoice();
		invoice.setCustName(invoiceRequest.getCustName());
		invoice.setCustLocation(invoiceRequest.getCustLocation());
		invoice.setCreated_on(invoiceRequest.getCreated_on());
		invoice.setQuantity(invoiceRequest.getQuantity());
		invoice.setUnit(invoiceRequest.getUnit());
		invoice.setLoadcharge(invoiceRequest.getLoadcharge());
		invoice.setUnloadcharge(invoiceRequest.getUnloadcharge());
		invoice.setFreightcharge(invoiceRequest.getFreightcharge());
		invoice.setHocharge(invoiceRequest.getHocharge());
		invoice.setHaltcharge(invoiceRequest.getHaltcharge());
		invoice.setComp(invoiceRequest.getComp());
		invoice.setDescription(invoiceRequest.getDescription());
		Trip trip_id = tripRepository.findOne(invoiceRequest.getTrip_id());
		if (trip_id != null) {
			System.out.println("trip_id is exist");
			invoice.setTrip(trip_id);
			return invoiceRepository.save(invoice);
		} else {
			System.out.println("trip_id is not exist");
			return null;
		}

	}

	// delete
	public void deleteInvoice(String id) {
		invoiceRepository.delete(id);
	}

	// update
	public void updateInvoice(String id, Invoice invoice) {
		invoice.setId(id);
		invoiceRepository.save(invoice);

	}

}
