package com.seshagiri.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController()
public class ProductServiceFallBack {
	
	 private static final Logger log = LoggerFactory.getLogger(ProductServiceFallBack.class);

	    @GetMapping("/products-fallback")
	    Flux<Void> getProductsFallback() {
	        log.info("Fallback for product service");
	        return Flux.empty();
	    }

		@GetMapping("/books-fallback")
	    Flux<Void> getBooksFallback() {
	        log.info("Fallback for book service");
	        return Flux.empty();
	    }

}
