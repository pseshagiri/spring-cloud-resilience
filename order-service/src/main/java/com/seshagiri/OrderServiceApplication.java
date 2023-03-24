package com.seshagiri;

import com.seshagiri.entity.OrderEntity;
import com.seshagiri.repo.OrderRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Lazy;

@SpringBootApplication

public class OrderServiceApplication {

	@Autowired
    @Lazy
    private EnableEurekaClient eurekaClient;

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	public CommandLineRunner sampleDate(OrderRepo orderRepo){
		return (args -> {
			orderRepo.save(new OrderEntity(1,"electronic","Mobile",2500.00,"KPHB"));
			orderRepo.save(new OrderEntity(2,"electronic","SmartWatch",250.00,"KPHB Main"));
			orderRepo.save(new OrderEntity(3,"electronic","IFB Washing Machine",25000.00,"KPHB"));
		});
	}
}
