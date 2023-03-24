package com.seshagiri.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.seshagiri.entity.ProductEntity;

@Repository()
public interface ProductRepository 
     extends CrudRepository<ProductEntity, Integer>{

}
