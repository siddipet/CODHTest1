package com.keybank.orders.service;

import com.keybank.orders.service.beans.OrderHistoryServiceReqBean;
import com.keybank.orders.service.beans.OrderHistoryServiceResBean;

public interface OrderHistoryService {

	OrderHistoryServiceResBean getOrderHistory(OrderHistoryServiceReqBean svcReqBean);
}
