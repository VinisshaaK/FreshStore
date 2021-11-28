package com.freshstore.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="subscription table")

	public class Subscription {
	@Id
	@Column(name="Prime_Key")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Prime_Key;
	private Integer User_ID;
	private String Subscription_Period;
	private boolean isActive;
	
	
	public long getPrime_Key() {
		return Prime_Key;
	}
	public void setPrime_Key(long prime_Key) {
		Prime_Key = prime_Key;
	}
	
	public Integer getUser_ID() {
		return User_ID;
	}
	public void setUser_ID(Integer user_ID) {
		User_ID = user_ID;
	}
	public String getSubscription_Period() {
		return Subscription_Period;
	}
	public void setSubscription_Period(String subscription_Period) {
		Subscription_Period = subscription_Period;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
}
