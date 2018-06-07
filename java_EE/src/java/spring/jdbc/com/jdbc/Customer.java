package com.jdbc;

public class Customer {
	
	int Id;
	int Age;
	String name;
	
	public Customer(int Id, String Name, int Age) {
		this.Id = Id;
		this.name = Name;
		this.Age = Age;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
