package com.keybank.orders.service.beans;

public class OrderDetails {

	private String startdate;
	private String enddate;
	private double balance;
	private String price;
	private String ordertype;
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getOrdertype() {
		return ordertype;
	}
	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderDetails [startdate=");
		builder.append(startdate);
		builder.append(", enddate=");
		builder.append(enddate);
		builder.append(", balance=");
		builder.append(balance);
		builder.append(", price=");
		builder.append(price);
		builder.append(", ordertype=");
		builder.append(ordertype);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
