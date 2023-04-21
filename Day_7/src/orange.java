
public class orange extends fruit{

	public orange(String colour,double weight,String name,boolean fresh)
	{
		super(colour,weight,name,fresh);
	}
	@Override
	public void taste()
	{
		System.out.println("Taste of orange:-Sour");
	}
	
	public void juice()
	{
		System.out.println(super.getName()+" "+super.getColour()+" We can make juice from orange");
	}
	
	public String toString()
	{
		return super.toString();
	}
}
