package com.keybank.orders.process.impl;

import java.util.ArrayList;
import java.util.List;

import com.keybank.orders.intg.OrderHistoryDAO;
import com.keybank.orders.intg.beans.OrderHistoryDAOReqBean;
import com.keybank.orders.intg.beans.OrderHistoryDAOResBean;
import com.keybank.orders.intg.beans.OrdersDao;
import com.keybank.orders.intg.impl.OrderHistoryDAOImpl;
import com.keybank.orders.process.OrderHistoryProcess;
import com.keybank.orders.process.beans.OrderHistoryProcessReqBean;
import com.keybank.orders.process.beans.OrderHistoryProcessResBean;
import com.keybank.orders.process.beans.OrdersProcess;

public class OrderHistoryProcessImpl implements OrderHistoryProcess {

	public OrderHistoryProcessResBean getOrderHistory(OrderHistoryProcessReqBean processReqBean) {
		System.out.println("Entered into process layer :: " +processReqBean);
		//prepare the dao req--i.e convert process request to dao request
		OrderHistoryDAOReqBean daoReq=new OrderHistoryDAOReqBean();
		daoReq.setClientId(processReqBean.getClientId());
		daoReq.setChannelId(processReqBean.getChannelId());
		daoReq.setCardNum(processReqBean.getCardNum());
		daoReq.setCvvNum(processReqBean.getCvvNum());
		daoReq.setNameoncard(processReqBean.getNameoncard());
		daoReq.setExpdate(processReqBean.getExpdate());
		daoReq.setOrdertype(processReqBean.getOrdertype());
		daoReq.setPrice(processReqBean.getPrice());
		daoReq.setStartdate(processReqBean.getStartdate());
		daoReq.setEnddate(processReqBean.getEnddate());
		daoReq.setBalance(processReqBean.getBalance());
		
		
		//call dao
		OrderHistoryDAO dao=new OrderHistoryDAOImpl();
		OrderHistoryDAOResBean daoRes=dao.getOrderHistory(daoReq);
		
		//prepare the process response with the help of daoResp
		
		OrderHistoryProcessResBean processResp=new OrderHistoryProcessResBean();
		processResp.setRespCode(daoRes.getRespCode());
		processResp.setRespMsg(daoRes.getRespMsg());
		
		List<OrdersDao> ordersDaoList = daoRes.getOrdersDao();//get the list of orders from dao
		List<OrdersProcess> ordersProcessList=new ArrayList<>();
		for(OrdersDao ordersDao:ordersDaoList) {
			OrdersProcess ordersProcess=new OrdersProcess();
			ordersProcess.setOid(ordersDao.getOid());
			ordersProcess.setName(ordersDao.getName());
			ordersProcess.setDate(ordersDao.getDate());
			ordersProcess.setDesc(ordersDao.getDesc());
			ordersProcess.setStatus(ordersDao.getStatus());
			ordersProcess.setType(ordersDao.getType());
			ordersProcessList.add(ordersProcess);
			
			
		}
		
		processResp.setOrdersProcess(ordersProcessList);
		
		System.out.println("Exit from process layer :: "+ processResp);
		
		return processResp;
	}

}
