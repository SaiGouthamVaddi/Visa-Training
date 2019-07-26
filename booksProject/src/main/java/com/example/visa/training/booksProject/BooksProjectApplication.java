package com.example.visa.training.booksProject;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.visa.training.booksProject.dal.BooksDAOImpl;
import com.example.visa.training.booksProject.domain.Book;
import com.example.visa.training.booksProject.domain.Chapter;

@SpringBootApplication
public class BooksProjectApplication {

	public static void main(String[] args) {
		
		//ApplicationContext springContainer = 
		SpringApplication.run(BooksProjectApplication.class, args);
		//BooksUtil util = springContainer.getBean(BooksUtil.class);
		//util.createBook();
		
		
	}

}
