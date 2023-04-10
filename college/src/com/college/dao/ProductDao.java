package com.college.dao;

import java.util.List;

import com.college.vo.ProductVo;

public interface ProductDao {

	int productSave(ProductVo vo);

	List<ProductVo> productList();

}
