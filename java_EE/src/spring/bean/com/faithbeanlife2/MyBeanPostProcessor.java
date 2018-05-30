package com.faithbeanlife2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanPostProcessor implements BeanPostProcessor {
	
	public MyBeanPostProcessor() {
		System.out.println("Constructor of MyBeanPostProcessor. ");
	}

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("call postProcessAfterInitialization and modify BeanName");
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("call postProcessBeforeInitialization and modify BeanName");
		return arg0;
	}
	
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		System.out.println("call BeanFactoryPostProcessor");
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("sb"); 
		beanDefinition.getPropertyValues().addPropertyValue("age", "21");
	}
	
	
}
