package com.gr21.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gr21.dao.OrdersDAO;
import com.gr21.entity.Orders;
import com.gr21.services.OrderService;
@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	OrdersDAO orderDao;
	public int addOrder(Orders ord) {
		// TODO Auto-generated method stub
		return orderDao.addOrder(ord);
	}
	
}
