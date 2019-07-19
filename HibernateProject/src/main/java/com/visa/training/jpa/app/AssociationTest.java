package com.visa.training.jpa.app;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.visa.training.jpa.dal.JpaUtil;
import com.visa.training.jpa.domain.Account;
import com.visa.training.jpa.domain.Address;
import com.visa.training.jpa.domain.Customer;
import com.visa.training.jpa.domain.SavingsAccount;

public class AssociationTest {

	public static void main(String[] args) {
		
		//createAccountAndCustomerSeperately();
		//readAccountAlongWithCustomer();
		//createAccountAndCustomerTogether();
		//testLazy();
		
		testManyToMany();
		System.exit(0);
	}

	private static void testManyToMany() {
		// TODO Auto-generated method stub
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Customer c = new Customer("adsf", "adf", "adfad", new Date(System.currentTimeMillis()));
		Address a = new Address("ad","rfds", "ghh", "uty", "idia", "dfa");
		
		tx.commit();
		em.close();
		
	}

	private static void testLazy() {
		// TODO Auto-generated method stub
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		Customer c1 = em.find(Customer.class, 39);
		Account a = c1.getAccounts().get(0);
		System.out.println(a.getBalance());
		em.close();
	}

	private static void readAccountAlongWithCustomer() {
		// TODO Auto-generated method stub
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		SavingsAccount sa = em.find(SavingsAccount.class, 34);
		System.out.println(sa.getCustomer().getFirstname());
		
		
		
		em.close();
		
	}

	private static void createAccountAndCustomerSeperately() {
		// TODO Auto-generated method stub
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Customer c = new Customer("fn", "mnad", "ln", new Date(System.currentTimeMillis()));
		SavingsAccount sa = new SavingsAccount(50000);
		sa.setCustomer(c);
		em.persist(c);
		em.persist(sa);
		tx.commit();
		em.close();
	}
	
	private static void createAccountAndCustomerTogether() {
		// TODO Auto-generated method stub
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Customer c = new Customer("fn", "mnad", "ln", new Date(System.currentTimeMillis()));
		SavingsAccount sa = new SavingsAccount(50000);
		sa.setCustomer(c);
		//em.persist(c);
		em.persist(sa);
		tx.commit();
		em.close();
	}
}
