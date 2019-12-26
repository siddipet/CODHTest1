package com.keybank.orders.process.beans;

import java.util.List;

public class OrderHistoryProcessResBean {

	private String respCode;
	private String respMsg;
	private List<OrdersProcess>OrdersProcess;
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
	public List<OrdersProcess> getOrdersProcess() {
		return OrdersProcess;
	}
	public void setOrdersProcess(List<OrdersProcess> ordersProcess) {
		OrdersProcess = ordersProcess;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderHistoryProcessResBean [respCode=");
		builder.append(respCode);
		builder.append(", respMsg=");
		builder.append(respMsg);
		builder.append(", OrdersProcess=");
		builder.append(OrdersProcess);
		builder.append("]");
		return builder.toString();
	}
	
}
