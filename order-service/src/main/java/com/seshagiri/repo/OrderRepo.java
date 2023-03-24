package com.seshagiri.repo;

import com.seshagiri.entity.OrderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends CrudRepository<OrderEntity,Integer> {
}
