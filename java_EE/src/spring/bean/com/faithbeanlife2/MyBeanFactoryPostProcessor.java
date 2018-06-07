package com.faithbeanlife2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	public MyBeanFactoryPostProcessor() {
		System.out.println("cus of MyBeanFactoryPostProcessor");
	}
	
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("call BeanFactoryPostProcessor");
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("sb"); 
		beanDefinition.getPropertyValues().addPropertyValue("age", "21");
	}

}
