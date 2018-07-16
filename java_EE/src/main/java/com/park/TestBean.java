package com.park;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
	@Test
	public void getTest() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/park/b.xml");
		Bean0 b1 = (Bean0) ac.getBean("bean0");
		b1.BSpeak();
	}
}
