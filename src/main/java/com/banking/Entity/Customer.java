package com.banking.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	private Long id;
	private String name;
	private String accounttype;
	private String phoneNumber;
	private String address;
	private String gender;
	private Long accountNumber;
	private float balance;
	
	public Customer() {
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public Customer(Long id, String name, String accounttype, String phoneNumber, String address, String gender,
			Long accountNumber, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.accounttype = accounttype;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.gender = gender;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	

}
