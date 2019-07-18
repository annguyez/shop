package com.gr21.services;

import java.util.List;

import com.gr21.entity.Category;
import com.gr21.entity.Product;
import com.gr21.model.CategoryDTO;

public interface CategoryServices {
	public List<Category> getListCategory();
	public List<Product> searchProductByCategory(int id);
}
