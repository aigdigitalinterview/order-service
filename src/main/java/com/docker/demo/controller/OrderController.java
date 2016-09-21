package com.docker.demo.controller;

import com.docker.demo.entity.Order;
import com.docker.demo.service.OrderService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kshah on 8/15/16.
 */
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping(method = RequestMethod.GET, value = "orders")
    @ApiOperation(value = "Get list of orders")
    public List<Order> getOrders(){
        return orderService.getOrders();
    }


    @RequestMapping(method = RequestMethod.POST, value = "orders")
    @ApiOperation(value = "Add a order")
    public void addOrder(@ApiParam @RequestBody Order order){
        orderService.addOrder(order);
    }
}
