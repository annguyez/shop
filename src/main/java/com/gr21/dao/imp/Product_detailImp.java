package com.gr21.dao.imp;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gr21.dao.Product_detailDAO;
import com.gr21.entity.Category;
import com.gr21.entity.Color;
import com.gr21.entity.Product_detail;
import com.gr21.entity.Size;
@Repository
@Transactional
public class Product_detailImp implements Product_detailDAO {

	@Autowired
	SessionFactory sessionFactory;
	public Product_detail getProduct_detail(int product_detail_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Product_detail.class, product_detail_id);
		
	}

	public List<Product_detail> getListProduct_detail() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql ="from Product_detail";
		Query query = session.createQuery(hql);
		List<Product_detail> list = query.getResultList();
		return list;

	}

	public String getProduct_detailName(int product_detail_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql ="select c.product_name from Product_detail c where product_detail_id = :product_detail_id";
		Query query = session.createQuery(hql);
		String product_name = (String) query.getSingleResult();
		return product_name;
	}

	public List<String> getListProduct_detailName() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql ="select c.product_name from Product_detail c";
		Query query = session.createQuery(hql);
		List<String> list = query.getResultList();
		return list;
	}

	public void create(Product_detail product_detail) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();	
		session.save(product_detail);
	}

	public void delete(int product_detail_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();	
		session.delete(this.getProduct_detail(product_detail_id));	
	}

	public void update(Product_detail product_detail) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(product_detail);
		
	}

	public List<Color> getColor(int product_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "select p.color from Product_detail p where product_id="+product_id;
		Query query = session.createQuery(hql);
		List<Color> list = query.getResultList();
		return list;
	}

	public List<Size> getSizeByColor(int color_id, int product_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "select p.size from Product_detail p where p.product.product_id="+product_id+" and p.color.color_id = "+color_id+"";
		Query query = session.createQuery(hql);
		List<Size> list = query.getResultList();
		return list;
	}
	

}
