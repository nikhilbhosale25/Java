package com.app.fruit;

public class mango extends  Fruit {

	public mango(String name,String color,double weight)
	{
		super(name,color,weight);	
	}
	
	@Override
	public String taste()
	{
		return "Sweet";
	}
	
	public void pulp()
	{
		System.out.println(super.getName()+" "+super.getColor()+" "+" Creting Pulp!");
	}
	
}
