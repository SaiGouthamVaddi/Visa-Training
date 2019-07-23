package com.visa.training.bootproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.visa.training.bootproject.domain.Product;
import com.visa.training.bootproject.dal.ProductRepository;
import com.visa.training.bootproject.dal.ProductRepository;


@Service
public class ProductServiceIMPL implements ProductService{

	ProductRepository dao;
	
	@Autowired
	public void setDao(ProductRepository dao) {
		this.dao = dao;
	}

	@Override
	public int addNewProduct(Product p) {
		
		int id = 0;
		if(p.getPrice()*p.getQoh() >= 1000)
		{
			Product created = dao.save(p);
			id = created.getId();
		}else {
			throw new IllegalArgumentException("Min value of the stock should be 10k");
		}
		return id;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		Product p = dao.findById(id);
		if(p.getPrice()*p.getQoh() > 1000) {
			throw new IllegalArgumentException("Can't remove when value > 1000");
		}else
		{
			dao.deleteById(id);
		}
	}

}
