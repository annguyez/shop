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

import com.gr21.dao.CategoryDAO;
import com.gr21.entity.Category;
import com.gr21.entity.Product;

@Repository
@Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CategoryImp implements CategoryDAO {

	@Autowired
	SessionFactory sessionFactory;
	public Category getCategory(int category_id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Category.class, category_id);
	}

	public List<Category> getListCategory() {
		Session session = sessionFactory.getCurrentSession();
		String hql ="from Category";
		Query query = session.createQuery(hql);
		List<Category> list = query.getResultList();
//		for(Category value : list) {
//			System.out.println(value.getCategory_name());
//		}
		return list;
	}

	public String getCategoryName(int category_id) {
		Session session = sessionFactory.getCurrentSession();
		String hql ="select c.category_name from Category c where category_id = :category_id";
		Query query = session.createQuery(hql);
		String category_name = (String) query.getSingleResult();
		return category_name;
	}

	public List<String> getListCategoryName() {
		Session session = sessionFactory.getCurrentSession();
		String hql ="select c.category_name from Category c";
		Query query = session.createQuery(hql);
		List<String> list = query.getResultList();
		return list;
	}

	public void create(Category category) {
		Session session = sessionFactory.getCurrentSession();	
		session.save(category);
	}

	public void delete(int category_id) {
		Session session = sessionFactory.getCurrentSession();	
		session.delete(this.getCategory(category_id));	
	}

	public void update(Category category) {
		Session session = sessionFactory.getCurrentSession();	
		session.update(this.getCategory(category.getCategory_id()));
		
	}

	public List<Product> searchProductByCategory(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Product where category_id="+id;
		Query query = session.createQuery(hql,Product.class);
		List<Product> result = query.getResultList();
		return result;
	}
	

}
