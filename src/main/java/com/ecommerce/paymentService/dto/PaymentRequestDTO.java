package com.ecommerce.paymentService.dto;

public class PaymentRequestDTO {

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	private Long orderId;
	private Integer amount;

}
