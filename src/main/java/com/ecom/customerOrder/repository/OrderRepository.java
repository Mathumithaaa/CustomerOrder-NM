package com.ecom.customerOrder.repository;

import com.ecom.customerOrder.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> { }