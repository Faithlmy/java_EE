package com.setInserte;

public class Car {
	
	private int number;
	private String name;
	private String colour;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}


	public Car(int number, String name, String colour) {
		super();
		this.number = number;
		this.name = name;
		this.colour = colour;
	}
	
	public Car()
	{
		super();
	}
	public  String toString()
	{
		return "CarName: " + name + "CarNumber: " + number + "CarColour: " + colour; 
	}
}
