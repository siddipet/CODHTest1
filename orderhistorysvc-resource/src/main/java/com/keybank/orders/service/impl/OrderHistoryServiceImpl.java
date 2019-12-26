package com.keybank.orders.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.keybank.orders.process.OrderHistoryProcess;
import com.keybank.orders.process.beans.OrderHistoryProcessReqBean;
import com.keybank.orders.process.beans.OrderHistoryProcessResBean;
import com.keybank.orders.process.beans.OrdersProcess;
import com.keybank.orders.process.impl.OrderHistoryProcessImpl;
import com.keybank.orders.service.OrderHistoryService;
import com.keybank.orders.service.beans.ClientContext;
import com.keybank.orders.service.beans.CustomerContext;
import com.keybank.orders.service.beans.OrderDetails;
import com.keybank.orders.service.beans.OrderDetailsService;
import com.keybank.orders.service.beans.OrderHistoryServiceReqBean;
import com.keybank.orders.service.beans.OrderHistoryServiceResBean;
import com.keybank.orders.service.beans.Orders;
import com.keybank.orders.service.beans.ServiceDetails;
import com.keybank.orders.service.beans.StatusBlock;

public class OrderHistoryServiceImpl implements OrderHistoryService {

	public OrderHistoryServiceResBean getOrderHistory(OrderHistoryServiceReqBean svcReqBean) {
		System.out.println("Entered into resource layer :: " +svcReqBean);
		
		// prepare the processReq --i.e, convert service request to process request
		OrderHistoryProcessReqBean processReq = new OrderHistoryProcessReqBean();
		processReq.setClientId(svcReqBean.getClientContext().getClientId());
		processReq.setChannelId(svcReqBean.getClientContext().getChannelId());
		processReq.setCardNum(svcReqBean.getCustContext().getCardNumber());
		processReq.setCvvNum(svcReqBean.getCustContext().getCvvNumber());
		processReq.setNameoncard(svcReqBean.getCustContext().getNameoncard());
		processReq.setExpdate(svcReqBean.getCustContext().getExpdate());
		processReq.setOrdertype(svcReqBean.getOrderDtls().getOrdertype());
		processReq.setPrice(svcReqBean.getOrderDtls().getPrice());
		processReq.setStartdate(svcReqBean.getOrderDtls().getStartdate());
		processReq.setEnddate(svcReqBean.getOrderDtls().getEnddate());
		processReq.setBalance(svcReqBean.getOrderDtls().getBalance());
	
		//prepare the process req
		OrderHistoryProcess process = new OrderHistoryProcessImpl();
		//call process and get the response
		OrderHistoryProcessResBean processRes = process.getOrderHistory(processReq);
		List<OrdersProcess> processList = processRes.getOrdersProcess();
		
		//prepare the service response with the help of process resp	
		OrderHistoryServiceResBean svcResp=new OrderHistoryServiceResBean();
		
		
		OrderDetailsService orderDetails=new OrderDetailsService();
		List<Orders> ordersList=new ArrayList<>();
		
		for(OrdersProcess ordersProcess:processList) {
			
			Orders orders=new Orders();
			orders.setOid(ordersProcess.getOid());
			orders.setName(ordersProcess.getName());
			orders.setDate(ordersProcess.getDate());
			orders.setDesc(ordersProcess.getDesc());
			orders.setStatus(ordersProcess.getStatus());
			orders.setType(ordersProcess.getType());
			
			ordersList.add(orders);
	
		}
		
		orderDetails.setOrders(ordersList);
		StatusBlock stblock=new StatusBlock();
		stblock.setRespCode(processRes.getRespCode());
		stblock.setRespMsg(processRes.getRespMsg());
		svcResp.setStblock(stblock);
		svcResp.setOrderDetails(orderDetails);
		

		System.out.println("Exit from resource layer :: " +svcResp);
		return svcResp;
	}

	public static void main(String[] args) {

		OrderHistoryService service = new OrderHistoryServiceImpl();

		OrderHistoryServiceReqBean request = new OrderHistoryServiceReqBean();

		ClientContext clientContext = new ClientContext();
		clientContext.setClientId("web");
		clientContext.setChannelId("online");
		clientContext.setReqId("abc123xyz");

		request.setClientContext(clientContext);

		CustomerContext custContext = new CustomerContext();
		custContext.setCardNumber("052114009967");
		custContext.setCvvNumber("876");
		custContext.setExpdate("12-2020");
		custContext.setNameoncard("Gurram Praveen");

		request.setCustContext(custContext);

		OrderDetails orderDtls = new OrderDetails();
		orderDtls.setStartdate("1-1-2020");
		orderDtls.setEnddate("1-15-2020");
		orderDtls.setPrice("1500");
		orderDtls.setOrdertype("electronics");
		orderDtls.setBalance(10000);

		request.setOrderDtls(orderDtls);

		ServiceDetails svcDtls = new ServiceDetails();
		svcDtls.setApiName("APITest");
		svcDtls.setSvcName("SVCTest");
		svcDtls.setVersion("VersionTest");

		request.setSvcDtls(svcDtls);

		OrderHistoryServiceResBean response = service.getOrderHistory(request);

	}

}
