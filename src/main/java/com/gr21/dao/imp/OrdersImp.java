package com.gr21.dao.imp;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gr21.dao.OrdersDAO;
import com.gr21.entity.Category;
import com.gr21.entity.Orders;
@Repository
@Transactional
public class OrdersImp implements OrdersDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public Orders getOrders(int orders_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		
		return session.get(Orders.class, orders_id);
	}

	public List<Orders> getListOrders() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = " from Orders";
		Query query = session.createQuery(hql);
		List<Orders> list = query.getResultList();
		return list;
	}

	public String getOrdersName(int odrers_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "select c.oders_name from Oders c where orders_id = :orders_id";
		Query query = session.createQuery(hql);
		String orders_name = (String) query.getSingleResult();
		return orders_name;
	}

	public List<String> getListOrdersName() {
		Session session = sessionFactory.getCurrentSession();
		String hql ="select c.orders_name from Orders c";
		Query query = session.createQuery(hql);
		List<String> list = query.getResultList();
		return list;
	}

	public void create(Orders order) {
		Session session = sessionFactory.getCurrentSession();	
		session.save(order);
	}

	public void delete(int orders_id) {
		Session session = sessionFactory.getCurrentSession();	
		session.delete(this.getOrders(orders_id));	
	}

	public void update(Orders order) {
		Session session = sessionFactory.getCurrentSession();	
		session.update(order);
		
	}

	public int addOrder(Orders ord) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		int id = (Integer) session.save(ord);
		if(0 < id) {
			return id;
		}else {
			return 0;
		}
	}

	

	
}
