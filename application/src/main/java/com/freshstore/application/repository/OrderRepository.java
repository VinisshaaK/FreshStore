package com.freshstore.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freshstore.application.model.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
