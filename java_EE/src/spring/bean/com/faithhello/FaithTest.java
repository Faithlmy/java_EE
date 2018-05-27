package com.faithhello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FaithTest {
	public static void  main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/faithhello/bean.xml");
		FaithHello fh = (FaithHello) ac.getBean("FaithHello");
		fh.getMessage();
	}

}
