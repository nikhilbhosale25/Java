
public class mango extends fruit {
	
	public mango(String colour,double weight,String name,boolean fresh)
	{
		super(colour,weight,name,fresh);
	}
	@Override
	public void taste()
	{
		System.out.println(" Taste of mango:- Sweet");
	}
	
	public void pulp()
	{
		System.out.println(super.getName()+" "+super.getColour()+" We can extract pulp of mango");
	}
	public String toString()
	{
		return super.toString();
	}
}
