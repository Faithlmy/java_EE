package com.faithbeanuse;

public class FaithHello {

	private String message;
	
	public FaithHello() {};

	public void  getMessage() {
		System.out.println("Your Message : " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
