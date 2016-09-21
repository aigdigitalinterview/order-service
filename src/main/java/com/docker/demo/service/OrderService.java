package com.docker.demo.service;

import com.docker.demo.entity.Order;
import com.docker.demo.repository.OrderRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kshah on 8/15/16.
 */
@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public List<Order> getOrders(){
        return Lists.newArrayList(orderRepository.findAll());
    }

    public void addOrder(Order order){
        orderRepository.save(order);
    }
}
