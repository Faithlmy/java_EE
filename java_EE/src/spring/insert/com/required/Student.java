package com.required;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	
	private String name;
	private Integer age;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Required
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getAge() {
		return age;
	}
}
