package com.gr21.services;

import java.util.List;

import com.gr21.entity.Product;

public interface ProductServices {
	public List<Product> getListProduct();
	public List<Product> getListProductShirt();
	public Product getProductDetailById(int product_id);
	public void delete(int product_id);
	public void create(Product product );
	
}
