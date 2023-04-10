package com.college.service;

import java.util.List;

import com.college.bo.ProductBo;

public interface ProductService {

	int productSave(ProductBo productBo);

	List<ProductBo> productList();

}
