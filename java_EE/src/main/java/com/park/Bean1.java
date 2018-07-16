package com.park;

import org.springframework.beans.factory.annotation.Autowired;

public class Bean1 {
	
	@Autowired
	private Bean2 b2;

	
	public Bean2 getB2() {
		return b2;
	}


	public void setB2(Bean2 b2) {
		this.b2 = b2;
	}


	public void BSpeak() {
		System.out.println(123);
		b2.speak();
	}

}
