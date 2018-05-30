package com.faithbeanlife2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FaithTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/faithbeanlife2/bean.xml");
		StudentBean sb = (StudentBean) ac.getBean("sb");
		System.out.println(sb);
		// destroy 
		((ClassPathXmlApplicationContext)ac).registerShutdownHook();
	}
}
