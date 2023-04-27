package com.app.fruit;

public class Orange extends Fruit{

	public Orange(String name, String color, double weight)
	{
		super(name, color, weight);
		
	}
	
	public String taste()
	{
		return "Sour";
	}
	
	public void juice()
	{
		System.out.println(super.getName()+" "+" "+super.getColor()+" Extracting juice!");
	}
	
	

}
