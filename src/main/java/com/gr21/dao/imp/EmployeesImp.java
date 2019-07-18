package com.gr21.dao.imp;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gr21.dao.EmployeesDAO;
import com.gr21.entity.Category;
import com.gr21.entity.Employees;
@Transactional
@Repository
public class EmployeesImp  implements EmployeesDAO{

	@Autowired
	SessionFactory sessionFactory;
	public Employees getEmployees(int employees_id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Employees.class, employees_id);
	}

	public List<Employees> getListEmployees() {
		Session session = sessionFactory.getCurrentSession();
		String hql ="from Employees";
		Query query = session.createQuery(hql);
		List<Employees> list = query.getResultList();
		for(Employees value :list) {
			System.out.println(value.getFullname());
		}
		return list;
	}

	public String getEmployeesName(int employees_id) {
		Session session = sessionFactory.getCurrentSession();
		String hql ="select c.employees_name from Employees c where employees_id = :employees_id";
		Query query = session.createQuery(hql);
		String employees_name = (String) query.getSingleResult();
		return employees_name;
	}

	public List<String> getListEmployeesName() {
		Session session = sessionFactory.getCurrentSession();
		String hql ="select c.category_name from Employees c";
		Query query = session.createQuery(hql);
		List<String> list = query.getResultList();
		return list;
	}

	public void create(Employees employees) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();	
		session.save(session);
	}

	public void delete(int employees_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();	
		session.delete(this.getEmployees(employees_id));	
	}

	public void update(Employees employees) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();	
		session.update(session);
	}
	

}
