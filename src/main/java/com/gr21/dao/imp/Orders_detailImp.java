package com.gr21.dao.imp;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.gr21.dao.Orders_detailDAO;
import com.gr21.entity.Orders_detail;
import com.gr21.entity.Orders_detail.Orders_detail_id;
@Repository
@Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Orders_detailImp implements Orders_detailDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	public boolean AddOrderDetail(Orders_detail orders_detail) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Orders_detail_id id =  (Orders_detail_id) session.save(orders_detail);
		if(null != id ) {
			return true;
		}else {
		return false;}
	}

}
