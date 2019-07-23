package com.visa.training.shop;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.visa.training.jdbc.Product;
import com.visa.training.jdbc.ProductDAO;


@WebServlet("/addcart")
public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<b>H</b>");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String qoh = request.getParameter("qoh");
		int id = 0;
		Product p = new Product(name, Float.valueOf(price), Integer.valueOf(qoh));
		try {
			id = ProductDAO.save(p);
			List<Product> products = ProductDAO.findAll();
			request.setAttribute("products_db", products);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
