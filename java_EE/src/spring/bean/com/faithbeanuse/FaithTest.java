package com.faithbeanuse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FaithTest {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/faithbeanuse/bean.xml");
		FaithHello hf = (FaithHello) ac.getBean("FaithHello");
		hf.setMessage("jingji");
		hf.getMessage();
		FaithHello hf1 = (FaithHello) ac.getBean("FaithHello");
		hf1.getMessage();
	}

}
