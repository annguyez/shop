package com.gr21.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gr21.dao.Orders_detailDAO;
import com.gr21.entity.Orders_detail;
import com.gr21.services.Orders_detailService;
@Service
public class Orders_detailServiceImpl implements Orders_detailService
{
	@Autowired
	Orders_detailDAO orders_detailDao;
	public boolean AddOrderDetail(Orders_detail orders_detail) {
		// TODO Auto-generated method stub
		
		return orders_detailDao.AddOrderDetail(orders_detail);
	}

}
