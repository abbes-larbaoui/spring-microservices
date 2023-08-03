package com.larbaoui.orderservice.repository;

import com.larbaoui.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}