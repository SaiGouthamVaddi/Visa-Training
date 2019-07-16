package com.visa.training.jdbc;

import java.sql.SQLException;
import java.util.List;

public class ProductUtil {

	public static void main(String[] args) throws SQLException {
		
		 Product p = new Product("Bottle", 50, 2); 
		 ProductDAO.save(p);
		/*
		 * Product p1 = new Product(2,"Cap", 30, 12); ProductDAO.save(p1);
		 */
		 
		
		/*
		 * Product p = ProductDAO.findById(1); System.out.println(p.toString());
		 */
		/*
		 * List<Product> l = ProductDAO.findAll();
		 * l.stream().forEach(System.out::println);
		 */
		
		ProductDAO.remove(1);
	}
}
