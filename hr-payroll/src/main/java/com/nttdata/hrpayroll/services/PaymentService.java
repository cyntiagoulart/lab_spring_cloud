package com.nttdata.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.nttdata.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment();

	}
}
	