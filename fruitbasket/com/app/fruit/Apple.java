package com.app.fruit;

public class Apple extends Fruit{
	
	public Apple(String name,String color,double weight)
	{
		super(name,color,weight);
	}
	
	public String taste()
	{
		return "Sweet and sour";
	}
	
	public void jam()
	{
		System.out.println(super.getName()+" "+super.getColor()+" "+" making jam!");
	}

}
