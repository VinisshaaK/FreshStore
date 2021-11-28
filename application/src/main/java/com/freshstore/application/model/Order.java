package com.freshstore.application.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")

public class Order implements Serializable {

	@Id
	@Column(name="Order_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer Order_ID;

	private String Payment_Confirmation;
	
	private long Total_Price;
	
	private String Email;
	
	private long Phone_No;

	private LocalDate Date_Placed = LocalDate.now();
	
	private LocalDate Delivery_Expected=Date_Placed.plusDays(3);
	private boolean isActive;
	
	//java.util.Date dt = new java.util.Date();

	//java.text.SimpleDateFormat sdf = 
	  //   new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Integer getOrder_ID() {
		return Order_ID;
	}
	public void setOrder_ID(Integer order_ID) {
		Order_ID = order_ID;
	}
	public String getPayment_Confirmation() {
		return Payment_Confirmation;
	}
	public void setPayment_Confirmation(String payment_Confirmation) {
		Payment_Confirmation = payment_Confirmation;
	}
	public long getTotal_Price() {
		return Total_Price;
	}
	public void setTotal_Price(long total_Price) {
		Total_Price = total_Price;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public long getPhone_No() {
		return Phone_No;
	}
	public void setPhone_No(long phone_No) {
		Phone_No = phone_No;
	}
	public LocalDate getDate_Placed() {
		return Date_Placed;
	}
	public void setDate_Placed(LocalDate date_Placed) {
		Date_Placed = date_Placed;
	}
	public LocalDate getDelivery_Expected() {
		return Delivery_Expected;
	}
	public void setDelivery_Expected(LocalDate delivery_Expected) {
		Delivery_Expected = delivery_Expected;
	}
	

}
