package com.pk;

import org.springframework.beans.factory.annotation.Autowired;



public class Bean11 {
	
	@Autowired
	private Bean2 b2;

	
	public Bean2 getB2() {
		return b2;
	}


	public void setB2(Bean2 b2) {
		this.b2 = b2;
	}


	public void BSpeak() {
		System.out.println("b11 speak");
		b2.speak();
	}

}
