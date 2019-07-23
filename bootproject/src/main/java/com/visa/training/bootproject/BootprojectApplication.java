package com.visa.training.bootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.visa.training.bootproject.ui.ProductConsoleUi;

@SpringBootApplication
public class BootprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootprojectApplication.class, args);
		/*
		 * ProductConsoleUi ui = springContainer.getBean(ProductConsoleUi.class);
		 * ui.createProductWithUi();
		 */
	
	}

}
