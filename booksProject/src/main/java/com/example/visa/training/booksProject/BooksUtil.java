package com.example.visa.training.booksProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.visa.training.booksProject.dal.BooksDAOImpl;
import com.example.visa.training.booksProject.domain.Book;
import com.example.visa.training.booksProject.domain.Chapter;

@Component
public class BooksUtil {

	@Autowired
	BooksDAOImpl impl;
	
	public void createBook() {
		Book b = new Book("b1", "a1", "c1", 1900);
		Chapter c = new Chapter(23, "ch1", 67);
		
		List<Chapter> ch = b.getChapters();
		ch.add(c);
		b.setChapters(ch);
		
		c.setBook(b);
		
		Book book = impl.save(b);
		
		System.out.println(book);
	}
}
