package com.keybank.orders.intg;

import com.keybank.orders.intg.beans.OrderHistoryDAOReqBean;
import com.keybank.orders.intg.beans.OrderHistoryDAOResBean;

public interface OrderHistoryDAO {
	OrderHistoryDAOResBean getOrderHistory(OrderHistoryDAOReqBean daoReq);
}
