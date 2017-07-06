package com.itrosys.accounting.controllers;

import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itrosys.accounting.model.Payment;
import com.itrosys.accounting.model.PaymentRequest;
import com.itrosys.accounting.services.PaymentService;

@RestController
@RequestMapping(path = "/payment")
public class PaymentController {

	@Autowired
	private PaymentService ps;

	/**
	 * List all Payment.
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/range/{startDate}/{endDate}")
	public Page<Payment> getAllPayment(Pageable pageable,@PathVariable("startDate") Date startDate,@PathVariable("endDate") Date endDate) {
		Page<Payment>payment= ps.getAllPayments(startDate,endDate,pageable);
		return payment;
	}

	/**
	 * Retrieve the Payment with the specified id.
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Payment getByPaymentId(@PathVariable("id") String id) {
		return ps.getByPaymentId(id);
	}

	/**
	 * add the Payment
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public String addPayment(@RequestBody PaymentRequest paymentRequest) {
		Payment payment = ps.addPayment(paymentRequest);
		if (payment != null) {
			return "Payment add successfully..";
		} else {
			return "Payment not added";
		}

	}

	/**
	 * delete the Payment with the specified id.
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deletePayment(@PathVariable("id") String id) {
		ps.deletePayment(id);
	}

	/**
	 * update the Payment with the specified id.
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public void updatePayment(@RequestBody Payment payment, @PathVariable String id) {
		ps.updatePayment(id, payment);
	}

}
