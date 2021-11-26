package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;


@Entity
@Table(name="users")
public class Users {
	
	@Id
	@GeneratedValue
	private int user_ID;
	
	private String first_Name;
	
	


	private String last_Name;
	
	private String email;
	
	private String password;
	
	private String country_Code;
	
	private String phone_Number;
	
	private Boolean is_Admin;
	
	
	private Boolean subscription;



	public int getUser_ID() {
		return user_ID;
	}



	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}



	public String getFirst_Name() {
		return first_Name;
	}



	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}



	public String getLast_Name() {
		return last_Name;
	}



	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getCountry_Code() {
		return country_Code;
	}



	public void setCountry_Code(String country_Code) {
		this.country_Code = country_Code;
	}



	public String getPhone_Number() {
		return phone_Number;
	}



	public void setPhone_Number(String phone_Number) {
		this.phone_Number = phone_Number;
	}



	public Boolean getIs_Admin() {
		return is_Admin;
	}



	public void setIs_Admin(Boolean is_Admin) {
		this.is_Admin = is_Admin;
	}



	public Boolean getSubscription() {
		return subscription;
	}



	public void setSubscription(Boolean subscription) {
		this.subscription = subscription;
	}
    
	


	public Users(int user_ID, String first_Name, String last_Name, String email, String password,
			String country_Code, String phone_Number, Boolean is_Admin, Boolean subscription) {
		super();
		this.user_ID = user_ID;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.email = email;
		this.password = password;
		this.country_Code = country_Code;
		this.phone_Number = phone_Number;
		this.is_Admin = is_Admin;
		this.subscription = subscription;
	}



	public Users() {
	}



}
