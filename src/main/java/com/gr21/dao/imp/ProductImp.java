package com.gr21.dao.imp;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.gr21.dao.ProductDAO;
import com.gr21.entity.Category;
import com.gr21.entity.Color;
import com.gr21.entity.Product;
import com.gr21.entity.Size;

@Repository
@Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ProductImp implements ProductDAO{

	@Autowired
	SessionFactory sessionFactory;
	public Product getProduct(int product_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Product.class, product_id);
	}
	
	public List<Product> getListProduct() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql ="from Product where category = '1'";
		Query query = session.createQuery(hql);
		List<Product> list = query.getResultList();
		return list;
	}
	public List<Product> getListProductShirt() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql ="from Product where category = '2'";
		Query query = session.createQuery(hql);
		List<Product> list = query.getResultList();
		return list;
	}
	public String getProductName(int product_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql ="select c.product_name from Product c where product_id = :product_id";
		Query query = session.createQuery(hql);
		String product_name = (String) query.getSingleResult();
		return product_name;
	}

	public List<String> getListCategoryName() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql ="select c.product_name from Product c";
		Query query = session.createQuery(hql);
		List<String> list = query.getResultList();
		return list;
	}

	public void create(Product product) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(product);
		
	}

	public void delete(int product_id) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		session.delete(this.getProduct(product_id));
	}

	public void update(Product product) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(product);
		
		
	}

	public Product getProductDetailById(int product_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql  = "from Product where product_id="+product_id;
		Product pr = (Product) session.createQuery(hql).getSingleResult();
		return pr;
	}

	public List<Color> getColorbySizeId(int size_id) {
		Session session = sessionFactory.getCurrentSession();
		String hql  = "from Product_detail where size_id="+size_id;
		List<Color> color = (List<Color>) session.createQuery(hql).getResultList();
		return (List<Color>) color;
	}

	

	

	

	
}
