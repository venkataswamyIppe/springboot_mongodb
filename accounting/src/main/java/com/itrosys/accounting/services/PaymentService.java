package com.itrosys.accounting.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.itrosys.accounting.model.Payment;
import com.itrosys.accounting.model.PaymentRequest;
import com.itrosys.accounting.model.Trip;
import com.itrosys.accounting.repositories.PaymentRespository;
import com.itrosys.accounting.repositories.TripRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRespository paymentRespository;

	@Autowired
	private TripRepository tripRepository;

	public Page<Payment> getAllPayments(Date startDate, Date endDate, Pageable pageable) {
		return paymentRespository.findAll(pageable);

	}

	public Payment addPayment(PaymentRequest paymentRequest) {
		Payment payment = new Payment();
		payment.setAmount(paymentRequest.getAmount());
		payment.setType(paymentRequest.getType());
		payment.setStartDate(paymentRequest.getStartDate());
		payment.setEndDate(paymentRequest.getEndDate());
		payment.setStatus(paymentRequest.getStatus());
		payment.setPayee(paymentRequest.getPayee());
		payment.setPayer(paymentRequest.getPayer());
		payment.setDescription(paymentRequest.getDescription());
		Trip trip_id = tripRepository.findOne(paymentRequest.getTrip_Id());
		if (trip_id != null) {
			payment.setTrip_Id(trip_id);
			return paymentRespository.save(payment);
		} else {
			return null;
		}
	}

	public Payment getByPaymentId(String id) {
		Payment payment = paymentRespository.findOne(id);
		return payment;
	}

	public void deletePayment(String id) {
		paymentRespository.delete(id);

	}

	public void updatePayment(String id, Payment payment) {
		payment.setId(id);
		paymentRespository.save(payment);

	}

}
