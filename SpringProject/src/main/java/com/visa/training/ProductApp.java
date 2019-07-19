package com.visa.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.visa.training.ui.ProductConsoleUi;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ProductConsoleUi ui = new ProductConsoleUi();
		Class[] configs = {ProductAppConfiguration.class, PersistenceJPAConfiguration.class };
		ApplicationContext springContainer = new AnnotationConfigApplicationContext(configs);
		
		ProductConsoleUi ui = springContainer.getBean(ProductConsoleUi.class);
		ui.createProductWithUi();

	}

}
