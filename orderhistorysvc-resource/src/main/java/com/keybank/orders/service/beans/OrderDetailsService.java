package com.keybank.orders.service.beans;

import java.util.List;

public class OrderDetailsService {

	private List<Orders> orders;

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderDetailsService [orders=");
		builder.append(orders);
		builder.append("]");
		return builder.toString();
	}
	
}
