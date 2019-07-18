package com.gr21.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gr21.dao.SizeDAO;
import com.gr21.entity.Size;
import com.gr21.services.SizeServices;

@Service
public class SizeServicesImpl implements SizeServices{

	@Autowired
	SizeDAO sizeDAO;
	public List<Size> getListSize() {
		// TODO Auto-generated method stub
		return sizeDAO.getListSize();
	}

}
