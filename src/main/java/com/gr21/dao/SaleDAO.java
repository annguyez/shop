package com.gr21.dao;

import java.util.List;

import com.gr21.entity.Sale;

public interface SaleDAO {
	public Sale getSale(int sale_id);
	public List<Sale> getListSale();
	public String getSaleName(int sale_id);
	public List<String> getListSaleName();
	public void create(Sale sale );
	public void delete(int sale_id);
	public void update(Sale sale);

}
