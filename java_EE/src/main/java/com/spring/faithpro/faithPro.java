package com.spring.faithpro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.faithhello.FaithHello;
import com.spring.faithhello.FaithHelloService;

public class faithPro {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/faithpro/beans.xml");
		FaithHelloService fhs = (FaithHelloService) context.getBean("faithHelloService");
		FaithHello fh = fhs.getFh();
		fh.sayFaithHello();
		
		FaithHelloService ff = (FaithHelloService) context.getBean("faith");
		FaithHello ff1 = ff.getFh();
		ff1.sayFaithHello();
	}

	
}
