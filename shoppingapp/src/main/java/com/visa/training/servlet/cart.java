package com.visa.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/cart")
public class cart extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			HttpSession session = request.getSession(true);
			//use String uri = request.getRequestUri and find which one invoked servlet
			if(request.getParameterValues("bikebox")!=null)
			{
				String[] bikes = request.getParameterValues("bikebox") ;
				session.setAttribute("bikes", Arrays.asList(bikes));
				RequestDispatcher rd = request.getRequestDispatcher("books.html");
				rd.forward(request, response);
			} else if(request.getParameterValues("bookbox")!=null){
				String[] books = request.getParameterValues("bookbox") ;
				session.setAttribute("books", Arrays.asList(books));
				RequestDispatcher rd = request.getRequestDispatcher("cars.html");
				rd.forward(request, response);
			} else if(request.getParameterValues("carbox")!=null){
				String[] carss = request.getParameterValues("carbox") ;
				session.setAttribute("cars", Arrays.asList(carss));
				
				List<String> books = (List<String>) session.getAttribute("books");
				List<String> bikes = (List<String>) session.getAttribute("bikes");
				List<String> cars = (List<String>) session.getAttribute("cars");
				
				out.println(books);
				out.println(cars);
				out.println(bikes);
				
				session.invalidate();
			} 
			
			
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
