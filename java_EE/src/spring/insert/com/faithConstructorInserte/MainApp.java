package com.faithConstructorInserte;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
//	@Test
//	public void Speak() {
//		ApplicationContext ac = new ClassPathXmlApplicationContext("com/faithConstructorInserte/bean.xml");
//		TextEditer ted = (TextEditer) ac.getBean("te");
//		ted.spellCheck();
//	}
	
//	public static void main(String[] args) {
//		ApplicationContext ac = new ClassPathXmlApplicationContext("com/faithConstructorInserte/bean.xml");
//		TextEditer ted = (TextEditer) ac.getBean("te");
//		ted.spellCheck();
//	}
	@Test
	public void GetCar() {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/faithConstructorInserte/bean.xml");
		Car  car = (Car) ac.getBean("car");
		System.out.println(car);
	}
	
	@Test
	public void GetPerson() {
		@SuppressWarnings("resource")
		ApplicationContext bc = new ClassPathXmlApplicationContext("com/faithConstructorInserte/bean.xml");
		Person p = (Person) bc.getBean("person");
		System.out.println(p);
	}
}
