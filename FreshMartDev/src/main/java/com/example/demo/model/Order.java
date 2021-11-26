package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="orders")
public class Order {

	@Id
	@GeneratedValue
	private int order_ID;

	private String date_Placed;
	
	private String delivery_Expected;
	
	private String payment_Confirmation;
	
	private String total_Price;
	
	private int User_ID;

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public int getOrder_ID() {
		return order_ID;
	}

	public void setOrder_ID(int order_ID) {
		this.order_ID = order_ID;
	}

	public String getDate_Placed() {
		return date_Placed;
	}

	public void setDate_Placed(String date_Placed) {
		this.date_Placed = date_Placed;
	}

	public String getDelivery_Expected() {
		return delivery_Expected;
	}

	public void setDelivery_Expected(String delivery_Expected) {
		this.delivery_Expected = delivery_Expected;
	}

	public String getPayment_Confirmation() {
		return payment_Confirmation;
	}

	public void setPayment_Confirmation(String payment_Confirmation) {
		this.payment_Confirmation = payment_Confirmation;
	}

	public String getTotal_Price() {
		return total_Price;
	}

	public void setTotal_Price(String total_Price) {
		this.total_Price = total_Price;
	}

	public int getUser_ID() {
		return User_ID;
	}

	public void setUser_ID(int user_ID) {
		User_ID = user_ID;
	}
	
	
	

}
