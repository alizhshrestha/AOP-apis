package com.springframework.masterclass.spring_aop_demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

	public void checkout(String status) {
		//Logging //*Aspect1
		//Authentication and Authorization //*Aspect2
		//Sanitize the Data //*Aspect2
		System.out.println("Checkout Method from Shopping Cart called");
	}
	
	public int quantity() {
		return 2;
	}
	
}
