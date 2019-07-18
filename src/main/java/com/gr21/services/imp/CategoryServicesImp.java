package com.gr21.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gr21.dao.CategoryDAO;
import com.gr21.dao.imp.CategoryImp;
import com.gr21.entity.Category;
import com.gr21.entity.Product;
import com.gr21.model.CategoryDTO;
import com.gr21.services.CategoryServices;

@Service
public class CategoryServicesImp implements CategoryServices {

	@Autowired
	CategoryDAO categoryDAO;

	public List<Category> getListCategory() {
		// TODO Auto-generated method stub
		return categoryDAO.getListCategory();
	}

	public List<Product> searchProductByCategory(int id) {
		// TODO Auto-generated method stub
		return categoryDAO.searchProductByCategory(id);
	}
	
	




}
