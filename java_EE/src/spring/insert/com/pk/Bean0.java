package com.pk;

public class Bean0 {

	private Bean1 b1;
	private Bean11 b11;
	private Bean3 b3;
	
	public Bean3 getB3() {
		return b3;
	}

	public void setB3(Bean3 b3) {
		this.b3 = b3;
	}

	public Bean11 getB11() {
		return b11;
	}

	public void setB11(Bean11 b11) {
		this.b11 = b11;
	}

	public Bean1 getB1() {
		return b1;
	}

	public void setB1(Bean1 b1) {
		this.b1 = b1;
	}
	
	
	public void BSpeak() {
		System.out.println(123);
		b1.BSpeak();
	}
	
	public void CSpeak() {
		System.out.println(456);
		b11.BSpeak();
	}
	
	public void DSpeak() {
		System.out.println(9090);
		b3.speak();
	}

}
