package com.gr21.dao;

import java.util.List;

import com.gr21.entity.Color;
import com.gr21.entity.Product;
import com.gr21.entity.Size;

public interface ProductDAO {
	public Product getProduct(int product_id);
	public List<Product> getListProduct();
	public List<Product> getListProductShirt();
	public String getProductName(int product_id);
	public List<String> getListCategoryName();
	public void create(Product product );
	public void delete(int product_id);
	public void update(Product product);
	public Product getProductDetailById(int product_id);

}
