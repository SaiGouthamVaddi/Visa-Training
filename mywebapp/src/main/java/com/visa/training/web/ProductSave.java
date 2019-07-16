package com.visa.training.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.visa.training.jdbc.Product;
import com.visa.training.jdbc.ProductDAO;

/**
 * Servlet implementation class Product
 */
@WebServlet("/productsave")
public class ProductSave extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String name = request.getParameter("name");
		float price = Float.valueOf(request.getParameter("price"));
		int qoh = Integer.valueOf(request.getParameter("qoh"));
		Product p = new Product(name, price,qoh);
		int id = 0;
		try {
			 id = ProductDAO.save(p);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PrintWriter out = response.getWriter();
		out.println("Created product with id: "+id);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
