package com.seshagiri;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.seshagiri.entity.ProductEntity;
import com.seshagiri.repo.ProductRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	public CommandLineRunner run(ProductRepository productRepository){
		return (args) -> {
			productRepository.save(new ProductEntity(1, "Real Me", "Mobile", 15000));
			productRepository.save(new ProductEntity(2, "Real Me", "Mobile", 15000));
			productRepository.save(new ProductEntity(3, "Real Me", "Mobile", 15000));
		};
	}

	/*
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'run'");
	}
	 */

}
