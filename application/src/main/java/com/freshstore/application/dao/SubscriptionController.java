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

import com.freshstore.application.model.Subscription;
import com.freshstore.application.repository.SubscriptionRepository;


@RestController
@CrossOrigin(origins="http://localhost:4200")
//@RequestMapping(path="orders")

public class SubscriptionController {
	

			@Autowired
			private SubscriptionRepository subscriptionRepository;
			
			@GetMapping("/getAll")
			public List<Subscription> getOrder(){
				return subscriptionRepository.findAll();                                               
			}
			@GetMapping("/get")
			public Optional<Subscription> getProductbyId(@RequestBody Long Order_ID){
				return subscriptionRepository.findById(Order_ID);                                               
			}
			
			
			@PostMapping("/post")
				public boolean postSubscription(@RequestBody Subscription subscription){
					Subscription savedSubscription = subscriptionRepository.save(subscription);
					return savedSubscription !=null;
				}
			@PutMapping("/put")
			public boolean updateSubscription(@RequestBody Subscription subscription)
			{
				Subscription updatedSubscription=subscriptionRepository.save(subscription); 
				return updatedSubscription !=null;
				
			}
			
			@DeleteMapping("/delete")
			public boolean deleteSubscription(@RequestBody Subscription subscription) 
			{
				subscriptionRepository.delete(subscription);
				return true;
			}
	
}
