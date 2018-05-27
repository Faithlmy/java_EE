package com.faithbeanlife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.faithbeanuse.FaithHello;

public class FaithTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/faithbeanlife/bean.xml");
		FaithHello hf = (FaithHello) ac.getBean("FaithHello");
		hf.setMessage("jingji");
		hf.getMessage();
//		ac.registerShutdownHook();
	}

}
