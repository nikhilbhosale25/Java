package com.app.fruit;

public abstract class Fruit {

	private String name;
	private String color;
	private double weight;
	
	private boolean fresh=true;

	public Fruit(String name, String color, double weight) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
	}

	
	public abstract String taste();
	
	public boolean isFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}
	
	@Override
	public String toString()
	{
		return "name: "+this.name+" Color: "+this.color+" weight: "+this.weight+"g";
	}
	
}
