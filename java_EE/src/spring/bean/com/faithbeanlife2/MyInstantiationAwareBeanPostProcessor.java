package com.faithbeanlife2;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter  {

	public MyInstantiationAwareBeanPostProcessor() {
		System.out.println("Constructor of mabpp.");
	}
	
	public Object postProcessBeforeInstantiation(Class beanClass, String name) {
		System.out.println("pbi");
		return null;
	}
	
	public Object postProcessAfterInitialization(Class beanClass, String name) {
		System.out.println("pai");
		return beanClass;
	}
	
	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName)
			throws BeansException{
			System.out.println("InstantiationAwareBeanPostProcessor");
		return pvs;
	}
}
