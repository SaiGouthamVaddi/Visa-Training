package com.visa.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.visa.training.dal.ProductDAO;
import com.visa.training.dal.ProductDAOInMemoryIMP;
import com.visa.training.service.ProductService;
import com.visa.training.service.ProductServiceIMPL;
import com.visa.training.ui.ProductConsoleUi;

@Configuration
@ComponentScan(basePackages="com.visa.training")
public class ProductAppConfiguration {
	
	/*
	 * @Bean public ProductDAO dao() { return new ProductDAOInMemoryIMP(); }
	 * 
	 * @Bean public ProductService service() { ProductServiceIMPL service = new
	 * ProductServiceIMPL(); service.setDao(dao()); return service; }
	 * 
	 * @Bean public ProductConsoleUi ui() { ProductConsoleUi ui = new
	 * ProductConsoleUi(); ui.setService(service()); return ui; }
	 */
}
