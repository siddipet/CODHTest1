package com.keybank.orders.intg.beans;

import java.util.List;

public class OrderHistoryDAOResBean {

	private String respCode;
	private String respMsg;
	private List<OrdersDao> ordersDao;

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	public String getRespMsg() {
		return respMsg;
	}

	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}

	public List<OrdersDao> getOrdersDao() {
		return ordersDao;
	}

	public void setOrdersDao(List<OrdersDao> ordersDao) {
		this.ordersDao = ordersDao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderHistoryDAOResBean [respCode=");
		builder.append(respCode);
		builder.append(", respMsg=");
		builder.append(respMsg);
		builder.append(", ordersDao=");
		builder.append(ordersDao);
		builder.append("]");
		return builder.toString();
	}

}
