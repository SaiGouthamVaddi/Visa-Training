package com.visa.training.ui;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.visa.training.Domain.Product;
import com.visa.training.service.ProductService;

@Component
public class ProductConsoleUi {

	ProductService service;
	
	@Autowired
	public void setService(ProductService service) {
		this.service = service;
	}

	public void createProductWithUi() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name = s.nextLine();
		System.out.println("Enter a price: ");
		Float price = Float.parseFloat(s.nextLine());
		System.out.println("Enter a qoh");
		Integer qoh = Integer.valueOf(s.nextLine());
		
		Product p = new Product(name, price, qoh);
		
		try {
			int id= service.addNewProduct(p);
			System.out.println("Created product with id: "+ id);
			
		}catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
	
}
