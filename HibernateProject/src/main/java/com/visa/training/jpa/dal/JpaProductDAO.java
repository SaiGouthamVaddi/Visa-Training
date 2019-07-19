package com.visa.training.jpa.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.visa.training.jpa.domain.Product;

public class JpaProductDAO {

	public List<Product> findAll(){
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		Query q = em.createQuery("select p from Product as p");
		List<Product> all = q.getResultList();
		em.close();
		return all;
		
	}
	
	public List<Product> findByPriceGreaterThan(float price)
	{
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		Query q = em.createQuery("select p from Product as p where p.price > ?");
		q.setParameter(1, price);
		List<Product> all = q.getResultList();
		em.close();
		return all;
	}
	public Product save(Product p) {
		
		EntityManagerFactory emf = JpaUtil.getEmf();
		EntityManager em = emf.createEntityManager();
		try
		{
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.persist(p);
			tx.commit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally {
			em.close();
		}
		
		
		return p;
	}
	
	public Product  findById(int id) {
		EntityManager em =  JpaUtil.getEmf().createEntityManager();
		Product p = em.find(Product.class, id);
		return p;
	}
	
	public Product updateProduct(Product p)
	{
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		//em.merge(p);
		Product r = em.find(Product.class, p.getId());
		r.setPrice(500);
		tx.commit();
		
		em.close();
		return p;
	}
	
	public void removeProduct(int id)
	{
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		//em.merge(p);
		Product r = em.find(Product.class, id);
		em.remove(r);
		tx.commit();
		
		em.close();
		
	}
}
