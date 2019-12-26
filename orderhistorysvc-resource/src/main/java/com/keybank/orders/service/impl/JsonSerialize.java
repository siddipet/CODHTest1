package com.keybank.orders.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keybank.orders.service.beans.ClientContext;
import com.keybank.orders.service.beans.CustomerContext;
import com.keybank.orders.service.beans.OrderDetails;
import com.keybank.orders.service.beans.OrderHistoryServiceReqBean;
import com.keybank.orders.service.beans.ServiceDetails;

public class JsonSerialize {

	public static void main(String[] args) throws JsonProcessingException {
		
		OrderHistoryServiceReqBean request=new OrderHistoryServiceReqBean();
		
		ClientContext clientContext=new ClientContext();
		clientContext.setClientId("web");
		clientContext.setChannelId("online");
		clientContext.setReqId("abc123xyz");
		
		request.setClientContext(clientContext);
		
		CustomerContext custContext=new CustomerContext();
		custContext.setCardNumber("052114009967");
		custContext.setCvvNumber("876");
		custContext.setExpdate("12-2020");
		custContext.setNameoncard("Gurram Praveen");
		
		request.setCustContext(custContext);
		
		OrderDetails orderDtls=new OrderDetails();
		orderDtls.setStartdate("1-1-2020");
		orderDtls.setEnddate("1-15-2020");
		orderDtls.setPrice("1500");
		orderDtls.setOrdertype("watch");
		orderDtls.setBalance(10000);
		
		request.setOrderDtls(orderDtls);
		
		ServiceDetails svcDtls=new ServiceDetails();
		svcDtls.setApiName("APITest");
		svcDtls.setSvcName("SVCTest");
		svcDtls.setVersion("VersionTest");
		
		request.setSvcDtls(svcDtls);
		
		
		ObjectMapper mapper=new ObjectMapper();
		//String jsonData = mapper.writeValueAsString(customer);
		String jsonData = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);
		
		System.out.println("JSON data is:"+jsonData);

	}

}
