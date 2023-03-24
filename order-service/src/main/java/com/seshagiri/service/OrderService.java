package com.seshagiri.service;

import com.seshagiri.entity.OrderEntity;
import com.seshagiri.pojo.Order;
import com.seshagiri.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;

    public List<Order> getAll(){
        return mapEntityToPojoList(orderRepo.findAll());
    }
    public Order getById(Integer id){
       return  mapEntityToPojo(orderRepo.findById(id).get());
    }

    private List<Order> mapEntityToPojoList(Iterable<OrderEntity> entityList){
        List<Order> orderList = new ArrayList<Order>();
        for (OrderEntity orderEntity : entityList) {
            orderList.add(mapEntityToPojo(orderEntity));
        }
        return orderList;
    }

    private Order mapEntityToPojo(OrderEntity entity){
        Order order = new Order();
        order.setId(entity.getId());
        order.setName(entity.getName());
        order.setProductName(entity.getProductName());
        order.setBillingAddress(entity.getBillingAddress());
        return order;
    }

    private OrderEntity mapPojoToEntity(Order pojo){
        OrderEntity order = new OrderEntity();
        //order.setId(entity.getId());
        order.setName(pojo.getName());
        order.setProductName(pojo.getProductName());
        order.setBillingAddress(pojo.getBillingAddress());
        return order;
    }

    public Order save(Order order){
      return mapEntityToPojo(orderRepo.save(mapPojoToEntity(order)));
    }
}
