package com.visa.training.jpa.dal;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.visa.training.jpa.domain.Account;

public class JpaAccountDAO {

	public Account save(Account a)
	{
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(a);
		tx.commit();
		return a;
		
	}
}
