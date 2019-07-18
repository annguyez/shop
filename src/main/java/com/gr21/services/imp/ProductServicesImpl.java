package com.gr21.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gr21.dao.ProductDAO;
import com.gr21.dao.imp.ProductImp;
import com.gr21.entity.Product;
import com.gr21.services.ProductServices;

@Service
public class ProductServicesImpl implements ProductServices {
	@Autowired
	ProductDAO productDAO;

	public List<Product> getListProduct() {
		// TODO Auto-generated method stub
		return productDAO.getListProduct();
	}

	public List<Product> getListProductShirt() {
		// TODO Auto-generated method stub
		return productDAO.getListProductShirt();
	}

	public Product getProductDetailById(int product_id) {
		// TODO Auto-generated method stub
		return productDAO.getProductDetailById(product_id);
	}

	public void delete(int product_id) {
		// TODO Auto-generated method stub
		productDAO.delete(product_id);

	}

	public void create(Product product) {
		// TODO Auto-generated method stub
		productDAO.create(product);
	}

}
