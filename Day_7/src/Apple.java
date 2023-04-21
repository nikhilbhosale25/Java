
public class Apple extends fruit  {

	public  Apple(String colour,double weight,String name,boolean fresh)
	{
		super(colour,weight,name,fresh);
		
	}
	
	@Override
	public void taste()
	{
		System.out.println("Taste of Apple:-Sour and Sweet");
	}
	
	public void jam()
	{
		System.out.println(super.getName()+" "+super.getColour()+" We can make jam from apple");
	}
	
	public String toString()
	{
		return super.toString();
	}

}
