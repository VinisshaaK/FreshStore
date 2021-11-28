package com.freshstore.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freshstore.application.model.Subscription;


public interface SubscriptionRepository extends JpaRepository<Subscription,Long> {

}
