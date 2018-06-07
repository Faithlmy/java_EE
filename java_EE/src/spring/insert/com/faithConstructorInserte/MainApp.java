package com.faithConstructorInserte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/faithConstructorInserte/bean.xml");
		TextEditer ted = (TextEditer) ac.getBean("te");
		ted.spellCheck();
		
	}
}
