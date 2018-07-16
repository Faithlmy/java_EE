package com.pk;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
	@Test
	public void getTest() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/pk/b.xml");
//		Bean0 b1 = (Bean0) ac.getBean("bean0");
		Bean0 b = (Bean0) ac.getBean("bean0");
//		b1.BSpeak();
//		b1.CSpeak();
		b.BSpeak();
		b.CSpeak();
		b.DSpeak();
	}
}
