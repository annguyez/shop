package com.gr21.dao;

import java.util.List;

import com.gr21.entity.Employees;

public interface EmployeesDAO {
	public Employees getEmployees(int employees_id);
	public List<Employees> getListEmployees();
	public String getEmployeesName(int employess_id);
	public List<String> getListEmployeesName();
	public void create(Employees employees);
	public void delete(int employees_id);
	public void update(Employees employees);
}
