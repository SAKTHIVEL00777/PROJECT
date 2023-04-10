package com.college.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.college.bo.ProductBo;
import com.college.dao.ProductDao;
import com.college.vo.ModelVo;
import com.college.vo.ProductVo;

@Transactional
@Service
public class ProductServiceImp implements ProductService {

	@Autowired
	ProductDao dao;
	
	@Override
	public int productSave(ProductBo productBo) {
		
		ProductVo vo=new ProductVo();
		
		vo.setProductName(productBo.getProductName());
		vo.setPrice(productBo.getPrice());
		
		List<ModelVo> modelvoList=new ArrayList<ModelVo>();
		
		ModelVo modelVoOne=new ModelVo();
		modelVoOne.setModelName(productBo.getModelOne());
		modelvoList.add(modelVoOne);
		
		ModelVo modelVoTwo=new ModelVo();
		modelVoTwo.setModelName(productBo.getModelTwo());
		modelvoList.add(modelVoTwo);
		
		vo.setModelvo(modelvoList);
		int count=dao.productSave(vo);
		return count;
	}

	@Override
	public List<ProductBo> productList() {
		
		List<ProductBo> list=new ArrayList<ProductBo>();
		List<ProductVo> listvo=new ArrayList<ProductVo>();
		
		listvo=dao.productList();
		
		for(ProductVo vo:listvo)
		{
			ProductBo productBo=new ProductBo();
			productBo.setProductId(vo.getProductId());
			productBo.setProductName(vo.getProductName());
			productBo.setPrice(vo.getPrice());
			
			List<ModelVo> modelvo=vo.getModelvo();
		    ModelVo	mvo1=new ModelVo();
		    mvo1=vo.getModelvo().get(0);
		    productBo.setModelOne(mvo1.getModelName());
		    
		    ModelVo	mvo2=new ModelVo();
		    mvo2=vo.getModelvo().get(1);
		    productBo.setModelTwo(mvo2.getModelName());
		    
		    list.add(productBo);
		    
		}
		return list;
	}

}
