package com.keybank.orders.service.beans;



public class OrderHistoryServiceResBean {

	private  StatusBlock stblock;
	private OrderDetailsService orderDetails;
	public StatusBlock getStblock() {
		return stblock;
	}
	public void setStblock(StatusBlock stblock) {
		this.stblock = stblock;
	}
	public OrderDetailsService getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(OrderDetailsService orderDetails) {
		this.orderDetails = orderDetails;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderHistoryServiceResBean [stblock=");
		builder.append(stblock);
		builder.append(", orderDetails=");
		builder.append(orderDetails);
		builder.append("]");
		return builder.toString();
	}
	
}
