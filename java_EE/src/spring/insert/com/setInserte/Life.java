package com.setInserte;

public class Life {
	
	private String name;
	private int number;
	private Car car;
	private Person person;
	
	public Life() {
		super();
	}
	public Life(String name, int number, Car car, Person person) {
		super();
		this.name = name;
		this.number = number;
		this.car = car;
		this.person = person;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Life [name=" + name + ", number=" + number + ", car=" + car + ", person=" + person + "]";
	}

}
