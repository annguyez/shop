package com.gr21.services;

import java.util.List;

import com.gr21.entity.Color;
import com.gr21.entity.Size;

public interface ProductDetailService {
	public List<Color> getColor(int product_id);
	public List<Size> getSizeByColor(int color_id, int product_id);
}
