package com.required;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRequired {

	@Test
	public void GetRequired() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/required/b.xml");
		Student s = (Student) ac.getBean("student");
		System.out.println("name: " + s.getName() + ", age: " + s.getAge());
	}
}
