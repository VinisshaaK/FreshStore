package com.freshstore.application.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freshstore.application.model.Order;
import com.freshstore.application.repository.OrderRepository;



@RestController
@CrossOrigin(origins="https://localhost:4200")
@RequestMapping(path="orders")

public class OrderController {
	 
		@Autowired
		private OrderRepository orderRepository;
		
		@GetMapping("/getAll")
		public List<Order> getOrder(){
			return orderRepository.findAll();                                               
		}
		@GetMapping("/get")
		public Optional<Order> getProductbyId(@RequestBody Long Order_ID){
			return orderRepository.findById(Order_ID);                                               
		}
		
		
		@PostMapping("/post")
			public boolean postOrder(@RequestBody Order order){
				Order savedOrder = orderRepository.save(order);
				return savedOrder !=null;
			}
		@PutMapping("/put")
		public boolean updateProduct(@RequestBody Order order)
		{
			Order updatedOrder=orderRepository.save(order); 
			return updatedOrder !=null;
			
		}
		
		@DeleteMapping("/delete")
		public boolean deleteOrder(@RequestBody Order order) 
		{
			 orderRepository.delete(order);
			return true;
		}
}
