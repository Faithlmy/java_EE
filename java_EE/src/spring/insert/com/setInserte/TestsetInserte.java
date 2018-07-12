package com.setInserte;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestsetInserte {
	@Test
	public void GetPerson() {
		@SuppressWarnings("resource")
		ApplicationContext bc = new ClassPathXmlApplicationContext("com/setInserte/bean.xml");
		Person p = (Person) bc.getBean("person");
		System.out.println(p);
	}
	
	@Test
	public void GetCar() {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/setInserte/bean.xml");
		Car car = (Car) ac.getBean("car");
		System.out.println(car);
	}
	

}
