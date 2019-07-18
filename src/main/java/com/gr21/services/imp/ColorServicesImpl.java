package com.gr21.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gr21.dao.ColorDAO;
import com.gr21.entity.Color;
import com.gr21.services.ColorServices;
@Service
public class ColorServicesImpl implements ColorServices{

	@Autowired
	ColorDAO colorDAO;
	public List<Color> getListColor() {
		// TODO Auto-generated method stub
		return colorDAO.getListColor();
	}
	
}
