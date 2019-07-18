package com.gr21.dao;

import java.util.List;

import com.gr21.entity.Orders;

public interface OrdersDAO {

	public Orders getOrders(int orders_id);
	public List<Orders> getListOrders();
	
	public String getOrdersName(int odrers_id);
	public List<String> getListOrdersName();
	public void create(Orders order);
	public void delete (int orders_id);
	public void update(Orders order);
	int addOrder(Orders ord);
}
