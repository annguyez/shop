package com.gr21.dao.imp;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gr21.dao.SaleDAO;
import com.gr21.entity.Category;
import com.gr21.entity.Sale;
@Transactional
@Repository
public class SaleImp implements SaleDAO{

	@Autowired
	SessionFactory sessionFactory;
	public Sale getSale(int sale_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Sale.class, sale_id);

	}

	public List<Sale> getListSale() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql ="from Sale";
		Query query = session.createQuery(hql);
		List<Sale> list = query.getResultList();
		return list;
	}

	public String getSaleName(int sale_id) {
		Session session = sessionFactory.getCurrentSession();
		String hql ="select c.sale_name from Sale c where sale_id = :sale_id";
		Query query = session.createQuery(hql);
		String sale_name = (String) query.getSingleResult();
		return sale_name;
	}

	public List<String> getListSaleName() {
		Session session = sessionFactory.getCurrentSession();
		String hql ="select c.sale_name from Sale c";
		Query query = session.createQuery(hql);
		List<String> list = query.getResultList();
		return list;
	}

	public void create(Sale sale) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();	
		session.save(sale);
		
	}

	public void delete(int sale_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();	
		session.delete(this.getSale(sale_id));	
		
	}

	public void update(Sale sale) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();	
		session.update(sale);
	}

}
