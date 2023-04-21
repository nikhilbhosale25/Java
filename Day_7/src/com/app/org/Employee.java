package com.app.org;

public class Employee {
	
	private int id;
	private String fname;
	private String lname;
	private int deptid;
	protected double basic;
	
	private static int idcounter;
	
	static
	{
		idcounter=0;
	}
	
	public Employee(int id, String fname, String lname, int deptid, double basic)
	
	{
		super();
		this.id = idcounter++;
		this.fname = fname;
		this.lname = lname;
		this.deptid = deptid;
		this.basic = basic;
	}
	public void increment(double amount)
	{
		this.basic+=amount;
		System.out.println("Basic salary after update"+basic);
	}
	
	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public int getDeptid() {
		return deptid;
	}

	public double getBasic() {
		return basic;
	}

	public void computeNetsal()
	{
		System.out.println("Salary= "+basic);
	}
	@Override
	public String toString()
	{
		return "id= "+id+" firstname= "+fname+" lastname= "+lname+" deptid= "+deptid+" basicSalary= "+basic;
	}
	
	
	 
}
