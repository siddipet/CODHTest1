package com.keybank.orders.process.beans;

public class OrderHistoryProcessReqBean {

	private String clientId;
	private String channelId;

	private String cardNum;
	private String cvvNum;
	private String expdate;
	private String nameoncard;

	private String startdate;
	private String enddate;
	private double balance;
	private String price;
	private String ordertype;

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getCvvNum() {
		return cvvNum;
	}

	public void setCvvNum(String cvvNum) {
		this.cvvNum = cvvNum;
	}

	public String getExpdate() {
		return expdate;
	}

	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}

	public String getNameoncard() {
		return nameoncard;
	}

	public void setNameoncard(String nameoncard) {
		this.nameoncard = nameoncard;
	}

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
		builder.append("OrderHistoryProcessReqBean [clientId=");
		builder.append(clientId);
		builder.append(", channelId=");
		builder.append(channelId);
		builder.append(", cardNum=");
		builder.append(cardNum);
		builder.append(", cvvNum=");
		builder.append(cvvNum);
		builder.append(", expdate=");
		builder.append(expdate);
		builder.append(", nameoncard=");
		builder.append(nameoncard);
		builder.append(", startdate=");
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
