package com.keybank.orders.process;

import com.keybank.orders.process.beans.OrderHistoryProcessReqBean;
import com.keybank.orders.process.beans.OrderHistoryProcessResBean;

public interface OrderHistoryProcess {
	OrderHistoryProcessResBean getOrderHistory(OrderHistoryProcessReqBean processReqBean);
}
