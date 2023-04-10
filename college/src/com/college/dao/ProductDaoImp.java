package com.college.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.college.vo.ProductVo;

@Repository
public class ProductDaoImp  implements ProductDao{

	
	@Autowired
	SessionFactory sf;
	
	@Override
	public int productSave(ProductVo vo) {
		int count=0;
		try {
			
			Session s=sf.getCurrentSession();
			count=(int) s.save(vo);
		} 
		
		catch (Exception e) {
			System.out.println(e);
		}
		return count;
	}

	@Override
	public List<ProductVo> productList() {
		
		List<ProductVo> list=new ArrayList<ProductVo>();
		
		try {
			
			Session s=sf.getCurrentSession();
			Criteria cr=s.createCriteria(ProductVo.class);
			cr.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
			list=cr.list();
		}
		catch (Exception e) {
         	System.out.println(e);
		}
		return list;
	}

}
