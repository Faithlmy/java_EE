package com.faithFuntionInserte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/faithFuntionInserte/bean.xml");
		TextEditer ted = (TextEditer) ac.getBean("textEditer");
		ted.spellCheck();
		
	}
}
