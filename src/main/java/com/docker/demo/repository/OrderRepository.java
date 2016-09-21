package com.docker.demo.repository;

import com.docker.demo.entity.Order;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by kshah on 8/15/16.
 */
@Repository
public interface OrderRepository extends PagingAndSortingRepository<Order, String> {
}
