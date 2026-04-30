package com.ecommerce.paymentService.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.paymentService.dto.PaymentRequestDTO;

@RestController
@RequestMapping("/api")
public class PaymentController {

	@PostMapping("/payment")
	public String paymentStatus(@RequestBody PaymentRequestDTO request) {
		return "Payment success for order id: " + request.getOrderId();
	}
}
