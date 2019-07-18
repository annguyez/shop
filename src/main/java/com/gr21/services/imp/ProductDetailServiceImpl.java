package com.gr21.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.gr21.dao.ProductDAO;
import com.gr21.dao.Product_detailDAO;
import com.gr21.entity.Color;
import com.gr21.entity.Size;
import com.gr21.services.ProductDetailService;

@Controller
public class ProductDetailServiceImpl implements ProductDetailService{
	
	@Autowired
	Product_detailDAO product_detailDao;
	
	public List<Color> getColor(int product_id) {
		// TODO Auto-generated method stub
		return product_detailDao.getColor(product_id);
	}

	public List<Size> getSizeByColor(int color_id, int product_id) {
		// TODO Auto-generated method stub
		return product_detailDao.getSizeByColor(color_id, product_id);
	}
	
}
