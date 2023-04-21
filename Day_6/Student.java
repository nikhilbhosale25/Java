package Day_6;

public class Student {

	private int mark1;
	private int mark2;
	private int mark3;
	private int total;
	private double per;
	
	public void accept(int mark1,int mark2,int mark3)
	{
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	
	private void caltotal()
	{
		total=mark1+mark2+mark3;
	}
	
	private void percentage()
	{
		per=(double)total/300*100;
	}
	
	public void display()
	{
		caltotal();// use of helper methods
		percentage();
		
		System.out.println("mark1= "+mark1+" mark2= "+mark2+" mark3= "+mark3+" total= "+total+" percnt= "+per);
	}
	
	public String toString()
	{
		caltotal();// use of helper methods
		percentage();
		return "mark1= "+mark1+" mark2= "+mark2+" mark3= "+mark3+" total= "+total+" percnt= "+per;
	}
	
	
}
