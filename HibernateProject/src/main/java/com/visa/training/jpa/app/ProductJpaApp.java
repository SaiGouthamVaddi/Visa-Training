package com.visa.training.jpa.app;

import com.visa.training.jpa.dal.JpaProductDAO;
import com.visa.training.jpa.domain.Product;

public class ProductJpaApp {
	public static void main(String[] args) {
		JpaProductDAO j = new JpaProductDAO();
		//Product p = new Product("iphoneX1", 100000,2);
		
		 //p.setId(5);
		 //Product r = j.updateProduct(p);
		 j.removeProduct(5);
		
		//System.out.println(r);
		 System.exit(0);
	}
}
