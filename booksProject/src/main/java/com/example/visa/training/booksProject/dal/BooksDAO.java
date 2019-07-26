package com.example.visa.training.booksProject.dal;

import java.util.List;

import com.example.visa.training.booksProject.domain.Book;

public interface BooksDAO {

	public Book save(Book b);
	public List<Book> findAll();
	public Book findById(int id);
	public Book update(Book b);
	public void remove(int id);
}
