package com.example.visa.training.booksProject.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.visa.training.booksProject.domain.Book;

@Repository
@Transactional
public class BooksDAOImpl implements BooksDAO{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public Book save(Book b) {
		
		System.out.println(b);
		em.persist(b);
		System.out.println("Reached here :::");
		return b;
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		Query q  = em.createQuery("select b from Book as b");
		List<Book> books = q.getResultList();
		return books;
	}

	@Override
	public Book findById(int id) {
		
		return em.find(Book.class, id);
	}

	@Override
	public Book update(Book b) {
		// TODO Auto-generated method stub
		return em.merge(b);
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		em.remove(em.find(Book.class, id));
		
	}

}
