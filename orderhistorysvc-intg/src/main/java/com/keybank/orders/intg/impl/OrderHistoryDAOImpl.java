package com.keybank.orders.intg.impl;

import java.util.ArrayList;
import java.util.List;

import com.keybank.orders.intg.OrderHistoryDAO;
import com.keybank.orders.intg.beans.OrderHistoryDAOReqBean;
import com.keybank.orders.intg.beans.OrderHistoryDAOResBean;
import com.keybank.orders.intg.beans.OrdersDao;

public class OrderHistoryDAOImpl implements OrderHistoryDAO {

	public OrderHistoryDAOResBean getOrderHistory(OrderHistoryDAOReqBean daoReq) {
		
		System.out.println("Entered into dao layer :: " +daoReq);
		
		//Get the request from process layer
		//prepare the request for DB
		//Call DB and get the resultSet response
		
		//Prepare the dao response with the help of resultset
		OrderHistoryDAOResBean daoResp=new OrderHistoryDAOResBean();
		daoResp.setRespCode("0");
		daoResp.setRespMsg("success");
		List<OrdersDao> ordersDaoList=new ArrayList<OrdersDao>();
		OrdersDao ordersDao=new OrdersDao();
		ordersDao.setOid("11111");
		ordersDao.setDate("1-12-2020");
		ordersDao.setName("watch");
		ordersDao.setDesc("good");
		ordersDao.setType("electronics");
		ordersDao.setStatus("delivered");
		
		OrdersDao ordersDao1=new OrdersDao();
		ordersDao1.setOid("22222");
		ordersDao1.setDate("1-11-2020");
		ordersDao1.setName("mobile");
		ordersDao1.setDesc("good");
		ordersDao1.setType("electronics");
		ordersDao1.setStatus("delivered");
		
		OrdersDao ordersDao2=new OrdersDao();
		ordersDao2.setOid("33333");
		ordersDao2.setDate("1-14-2020");
		ordersDao2.setName("laptop");
		ordersDao2.setDesc("good");
		ordersDao2.setType("electronics");
		ordersDao2.setStatus("pending");
		
		ordersDaoList.add(ordersDao);
		ordersDaoList.add(ordersDao1);
		ordersDaoList.add(ordersDao2);
		
		
		
		daoResp.setOrdersDao(ordersDaoList);
		
		
		System.out.println("Exit from dao layer :: " +daoResp);
		
		return daoResp;
	}

}
