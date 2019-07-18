package com.gr21.dao;

import java.util.List;

import com.gr21.entity.Color;
import com.gr21.entity.Product_detail;
import com.gr21.entity.Size;

public interface Product_detailDAO {
	public Product_detail getProduct_detail(int product_detail_id);
	public List<Product_detail> getListProduct_detail();
	public String getProduct_detailName(int product_detail_id);
	public List<String> getListProduct_detailName();
	public void create(Product_detail product_detail );
	public void delete(int product_detail_id);
	public void update(Product_detail product_detail);
	public List<Color> getColor(int product_id);
	public List<Size> getSizeByColor(int color_id, int product_id);

}
