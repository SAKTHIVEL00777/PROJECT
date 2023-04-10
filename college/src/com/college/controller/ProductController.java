package com.college.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.college.bo.ProductBo;
import com.college.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	 ProductService service;
	
	@RequestMapping(value="/createproduct",method=RequestMethod.GET)
	public String product(Model model)
	{
		ProductBo productBo=new ProductBo();
		model.addAttribute("productBo",productBo );
		return  "createProduct";
	}
	
		
	@RequestMapping(value="/createproduct",method=RequestMethod.POST)
	public String productSave(Model model,@ModelAttribute("productBo")ProductBo productBo)
	{
		
		int count=service.productSave(productBo);
		if(count>0)
		{
			model.addAttribute("productBo", productBo);
		}
		return"createProduct";
		}
	
	
	@RequestMapping(value="/listProduct",method=RequestMethod.GET)
	public String productList( Model model)
	
	{
		
		List<ProductBo> list=new ArrayList<ProductBo>();
		list=service.productList();
		if(null!=list)
		{
			model.addAttribute("ref", list);
		}
		return "pro-list";
		
	}
	}


