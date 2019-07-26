package com.visa.training.bootproject.ui;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.visa.training.bootproject.domain.Product;
import com.visa.training.bootproject.service.ProductService;

@Component
public class ProductConsoleUi {

	ProductService service;
	String uri = "http://localhost:8080/api/products";
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
			RestTemplate restTemplate = new RestTemplate();
			restTemplate.postForEntity(uri, p, Product.class);
			ResponseEntity<List<Product>> response = restTemplate.exchange(uri, HttpMethod.GET, null, 
					new ParameterizedTypeReference<List<Product>>() {});
			List<Product> products = response.getBody(); 
			System.out.println(products);
			
		}catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
	
}
