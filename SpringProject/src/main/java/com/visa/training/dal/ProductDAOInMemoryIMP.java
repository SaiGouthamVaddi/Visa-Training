package com.visa.training.dal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.visa.training.Domain.Product;

//@Repository
public class ProductDAOInMemoryIMP implements ProductDAO {
	
	int idSequence;
	Map<Integer, Product> data = new HashMap<>();
	
	@Override
	public List<Product> findAll() {
		
		return new ArrayList<>(data.values());
	}

	@Override
	public Product save(Product p) {
		
		int id = ++idSequence;
		p.setId(id);
		data.put(id, p);
		return p;
	}

	@Override
	public Product findById(int id) {
		
		return data.get(id);
	}

	@Override
	public void update(Product p) {
		data.put(p.getId(), p);
		
	}

	@Override
	public void remove(int id) {
		data.remove(id);
		
	}
	
	

}
