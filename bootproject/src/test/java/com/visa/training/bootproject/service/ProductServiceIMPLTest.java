package com.visa.training.bootproject.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import com.visa.training.bootproject.dal.ProductRepository;
import com.visa.training.bootproject.domain.Product;

public class ProductServiceIMPLTest {

	@Test
	public void addNewProduct_returns_Valid_Id_When_Value_Gt_MinValue() {
		//Arrange
		ProductServiceIMPL impl = new ProductServiceIMPL();
		Product toBeAdded = new Product("test",1005,2);
		Product added = new Product("test", 10000, 2);
		added.setId(1);
		ProductRepository mockDAO = Mockito.mock(ProductRepository.class);
		Mockito.when(mockDAO.save(toBeAdded)).thenReturn(added);
		impl.setDao(mockDAO);
		//Act
		int id = impl.addNewProduct(toBeAdded);
		//Assert
		assertTrue(id>0);
	}

}
