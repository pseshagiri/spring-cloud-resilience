package com.seshagiri.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seshagiri.entity.ProductEntity;
import com.seshagiri.model.Product;
import com.seshagiri.repo.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAll() {
		return mapEntityTOProduct(productRepository.findAll());
	}

	public Product getById(Integer id) {
		return mapEntityTOProductPojo((productRepository.findById(id)).get());
	}

	private List<Product> mapEntityTOProduct(Iterable<ProductEntity> products) {
		List<Product> productsPojo = new ArrayList<>();
		for (ProductEntity entity : products) {			
			productsPojo.add(mapEntityTOProductPojo(entity));
		}
		return productsPojo;
	}

	private Product mapEntityTOProductPojo(ProductEntity entity) {
		Product productpojo = null;
		productpojo = new Product();
		productpojo.setId(entity.getProductId());
		productpojo.setProductName(entity.getProductName());
		productpojo.setProductType(entity.getProductType());
		productpojo.setPrice(entity.getPrice());
		return productpojo;
	}
	
	private ProductEntity mapProductTOEntity(Product product) {
		ProductEntity entity = null;
		entity = new ProductEntity();
		//entity.setProductId(product.getId());
		entity.setProductName(product.getProductName());
		entity.setProductType(product.getProductType());
		entity.setPrice(product.getPrice());
		return entity;
	}
	
	public Product add(Product product) {
		ProductEntity entity = mapProductTOEntity(product);
		return mapEntityTOProductPojo(productRepository.save(entity));
	}

	public int delete(Integer id) {
		ProductEntity entity = productRepository.findById(id).get();
		try{
		 productRepository.delete(entity);
		 return 1;
		}catch(Exception exp){
		   return 0;
		} 

	}
}
