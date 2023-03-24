package com.seshagiri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seshagiri.model.Product;
import com.seshagiri.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired()
	private ProductService productService;

	@GetMapping()
	public List<Product> getAll() {
		return productService.getAll();
	}

	@GetMapping("/{id}")
	public Product getById(@PathVariable("id") String id) {
		return productService.getById(Integer.parseInt(id));
	}
	
	@PostMapping(value="/add",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public Product add(@RequestBody() Product product) {
		return productService.add(product);
	}

	@GetMapping(value="/delete",produces = MediaType.APPLICATION_JSON_VALUE)
	public Integer delete(@PathVariable("id") Integer id) {
		return productService.delete(id);
	}
}
