package com.constructorInserte;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructor {
	@Test
	public void GetCar() {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/constructorInserte/bean.xml");
		Car  car = (Car) ac.getBean("car");
		System.out.println(car);
	}
	
	@Test
	public void GetPerson() {
		@SuppressWarnings("resource")
		ApplicationContext bc = new ClassPathXmlApplicationContext("com/constructorInserte/bean.xml");
		Person p = (Person) bc.getBean("person");
		System.out.println(p);
	}
}
