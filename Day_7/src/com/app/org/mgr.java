package com.app.org;

public class mgr extends Employee {

	private double perbonus;
	public mgr(int id, String fname, String lname, int deptid, double basic)
	{
		super(id, fname, lname, deptid, basic);
		
	}

	public double getPerbonus() {
		return perbonus;
	}

	@Override
	public void computeNetsal()
	{
		System.out.println("maneger salary= "+super.basic+this.perbonus);
	}
	
	@Override
	public String toString()
	{
		return super.toString();
	}
	
	
}
