package com.faithbeanlife2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class StudentBean implements InitializingBean, DisposableBean, BeanNameAware,BeanFactoryAware {

	private String name;
	private int age;
	
	private String beanName;
	private BeanFactory beanfactory;
	
	public StudentBean() {
		System.out.println("Constructor of StudentBean.");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Insert the Name of student. ");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Insert the Age of student. ");
		this.age = age;
	}
	
	public void myInit() {
		// The method of init.
		System.out.println("init");
		
	}
	
	public void myDestroy() {
		// The method of destroy.
		System.out.println("dectroy");
		
	}

	public BeanFactory getBeanfactory() {
		return beanfactory;
	}

//	public void setBeanfactory(BeanFactory beanfactory) throws BeansException{
//		this.beanfactory = beanfactory;
//		System.out.println("the interface of BeanFactoryAware");
//	}

	public String getBeanName() {
		return beanName;
	}

	
	
	public String toString() {
		return "{age  " + age + "name  " + name + "beanName " + beanName + "}";
	}
	
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		this.beanfactory = beanfactory;
		System.out.println("the interface of BeanFactoryAware.");
		
	}

	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.beanName = name;
		System.out.println("BeanNameAware call setBeanName.");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DisposableBean call destroy.");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet call InitializingBean.");
		
	}

	
}
