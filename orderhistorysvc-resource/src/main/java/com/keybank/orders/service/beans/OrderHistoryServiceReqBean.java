package com.keybank.orders.service.beans;

public class OrderHistoryServiceReqBean {

	private ClientContext clientContext;
	private CustomerContext custContext;
	private OrderDetails orderDtls;
	private ServiceDetails svcDtls;
	public ClientContext getClientContext() {
		return clientContext;
	}
	public void setClientContext(ClientContext clientContext) {
		this.clientContext = clientContext;
	}
	public CustomerContext getCustContext() {
		return custContext;
	}
	public void setCustContext(CustomerContext custContext) {
		this.custContext = custContext;
	}
	public OrderDetails getOrderDtls() {
		return orderDtls;
	}
	public void setOrderDtls(OrderDetails orderDtls) {
		this.orderDtls = orderDtls;
	}
	public ServiceDetails getSvcDtls() {
		return svcDtls;
	}
	public void setSvcDtls(ServiceDetails svcDtls) {
		this.svcDtls = svcDtls;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderHistoryServiceReqBean [clientContext=");
		builder.append(clientContext);
		builder.append(", custContext=");
		builder.append(custContext);
		builder.append(", orderDtls=");
		builder.append(orderDtls);
		builder.append(", svcDtls=");
		builder.append(svcDtls);
		builder.append("]");
		return builder.toString();
	}
	
	
}
