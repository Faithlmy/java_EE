package com.setInserte;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestsetInserte {
	
	@Test
	public void GetCar() {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/setInserte/b.xml");
		Car car = (Car) ac.getBean("car");
		System.out.println(car);
	}
	@Test
	public void GetPerson() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/setInserte/b.xml");
		Person p = (Person) ac.getBean("person");
		System.out.println(p.getCar());
		System.out.println(p);
	}
	
	@Test
	public void GetLife() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/setInserte/b.xml");
		Life l = (Life) ac.getBean("life");
		System.out.println(l);
	}
	

}
