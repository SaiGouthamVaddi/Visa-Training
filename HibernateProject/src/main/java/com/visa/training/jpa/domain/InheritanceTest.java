package com.visa.training.jpa.domain;

import com.visa.training.jpa.dal.JpaAccountDAO;

public class InheritanceTest {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(10000);
		CurrentAccount ca = new CurrentAccount(20000, 5000);
		JpaAccountDAO j = new JpaAccountDAO();
		Account s = j.save(sa);
		Account n = j.save(ca);
		System.out.println(s.getClass().getName());
	}
}
