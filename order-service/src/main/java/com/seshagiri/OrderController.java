package com.seshagiri;

import com.seshagiri.pojo.Order;
import com.seshagiri.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController
{
    @Autowired
    OrderService orderService;

   @GetMapping()
   public List<Order> getAll(){
     return orderService.getAll();
   }


    @GetMapping("/{id}")
    public Order getById(@PathVariable("id") Integer id){
       return orderService.getById(id);
    }

    @PostMapping("/add")
    public Order add(@RequestBody() Order order){
       return orderService.save(order);
    }

}
