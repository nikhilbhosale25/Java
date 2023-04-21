package com.app.org;

public class worker extends Employee {

	private int hoursWorked;
	private int hourlyRate;
	private double total;
	
	
	public worker(int id, String fname, String lname, int deptid, double basic)
	{
		super(id, fname, lname, deptid, basic);
		
	}

	public double hoursWorked() {
		return hoursWorked;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	@Override
	public void computeNetsal()
	{
		System.out.println("worker salary= "+super.basic+(this.hoursWorked*this.hourlyRate));
	}
	@Override
	public String toString()
	{
		return super.toString()+" "+(this.hourlyRate*this.hoursWorked);
	}
	
	
}
