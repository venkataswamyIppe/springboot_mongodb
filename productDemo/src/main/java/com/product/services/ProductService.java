package com.product.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.product.model.Product;
import com.product.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	// get all

	public Page<Product> getAllProducts(Pageable pageable) {
		return productRepository.findAll(pageable);

	}

	// get by id
	public Product getByProductId(String id) {
		return productRepository.findOne(id);
	}

	// save
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	// delete
	public void deleteProduct(String id) {
		productRepository.delete(id);
	}

	// update
	public void updateProduct(String id, Product product) {
		product.setId(id);
		productRepository.save(product);

	}

}
