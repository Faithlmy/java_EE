package com.faithInserteBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/faithInserteBean/bean.xml");
		TextEditer ted = (TextEditer) ac.getBean("textEditor");
		ted.spellCheck();
		
	}
}
