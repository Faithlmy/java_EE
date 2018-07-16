package com.setInserte;

public class Car {
	
	private int number;
	private String name;
	private String colour;
	
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
		return "CarName: " + name + ",  CarNumber: " + number + ",  CarColour: " + colour; 
	}
}
