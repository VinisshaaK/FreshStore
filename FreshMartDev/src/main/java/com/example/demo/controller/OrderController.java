package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Order;
import com.example.demo.service.OrderService;


@RestController
@RequestMapping("orders")
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@GetMapping
	public String getOrder()
	{
		return "get Order was called";
				
	}
	@PostMapping
	public void createOrder(@Validated @RequestBody Order  order)
	{
		
	orderService.createOrder(order);
		
		
	}
	
	@PutMapping
	public String updateOrder()
	{
		return "update Order was called";
		
	}
	
	@DeleteMapping
	public String deleteOrder() 
	{
		return "delete Order was called";
	}
}
