package com.faithConstructorInserte;

public class Person {

	private int age;
	private String name;
	private Car car;
	
	public Person(int age, String name, Car car) {
		super();
		this.age = age;
		this.name = name;
		this.car = car;
	}
	
	public Person()
	{
		super();
	}
	
	public String toString() {
		return "name: " + name + "age: " + age + "car: " + car;
	}
}
