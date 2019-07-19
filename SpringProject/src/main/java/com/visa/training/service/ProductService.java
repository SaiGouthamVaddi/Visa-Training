package com.visa.training.service;

import java.util.List;

import com.visa.training.Domain.Product;

public interface ProductService {
	
	public int addNewProduct(Product p);
	public List<Product> findAll();
	public Product findById(int id);
	public void deleteProduct(int id);

}
