package com.example.visa.training.booksProject.web;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.visa.training.booksProject.dal.BooksDAO;
import com.example.visa.training.booksProject.domain.Book;

@RestController
public class BooksRestController {

	@Autowired
	BooksDAO dao;

	@RequestMapping(value = "/api/books", method = RequestMethod.GET)
	public List<Book> getAll() {
		return dao.findAll();
	}

	@RequestMapping(value = "/api/books/{id}", method = RequestMethod.GET)
	public ResponseEntity<Book> findBook(@PathVariable("id") int id) {
		Book b = dao.findById(id);
		if (b != null) {
			return new ResponseEntity<Book>(b, HttpStatus.OK);
		} else {
			return new ResponseEntity<Book>(HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value="/api/books", method = RequestMethod.POST)
	public ResponseEntity addBook(@RequestBody Book b)
	{
		try {
			dao.save(b);
			
			return new ResponseEntity<>(HttpStatus.CREATED);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value="/api/books/{id}", method = RequestMethod.DELETE)
	public ResponseEntity addBook(@PathVariable("id") int id)
	{
		dao.remove(id);
		return new ResponseEntity(HttpStatus.OK);
	}
	
}
