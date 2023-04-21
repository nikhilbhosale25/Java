package Day_3_BL;

public class Point {
	
	private int x;
	private double y;
	
	public Point()
	{
		this.x=10;
		this.y=20.20;
	}
	
	public Point(int x,double y)
	{
		this.x=x;
		this.y=y;
	}
	
	public void setX(int x)
	{
		this.x=x;
	}
	
	public int getX()
	{
		return x;
	}
	
	public void setY(double y)
	{
		this.y=y;
	}
	
	public double getY()
	{
		return y;
	}
	
	public void display()
	{
		System.out.println("X= "+this.x);
		System.out.println("Y= "+this.y);
	}
	
}
