package com.faithInserteClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
	      ApplicationContext context = 
	             new ClassPathXmlApplicationContext("com/faithInserteClass/bean.xml");
	      JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
	      jc.getAddressList();
	      jc.getAddressSet();
	      jc.getAddressMap();
	      jc.getAddressProp();
	   }
}
