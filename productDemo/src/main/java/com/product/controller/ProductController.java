package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Product;
import com.product.services.ProductService;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

	@Autowired
	ProductService ps;

	/**
	 * List all products.
	 */
	@RequestMapping("/all")
		public Page<Product> list( Pageable pageable){
			Page<Product> products =ps.getAllProducts(pageable);
			return products;
	
	}

	/**
	 * Retrieve the product with the specified id.
	 */
	@RequestMapping("/{id}")
	public Product getByProductId(@PathVariable("id") String id) {
		return ps.getByProductId(id);
	}

	/**
	 * add the product
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public void addProduct(@RequestBody Product product) {
		ps.addProduct(product);

	}

	/**
	 * delete the product with the specified id.
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteProduct(@PathVariable("id") String id) {
		ps.deleteProduct(id);
	}

	/**
	 * update the product with the specified id.
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public void updateProduct(@RequestBody Product product, @PathVariable String id) {
		ps.updateProduct(id, product);
	}

}
