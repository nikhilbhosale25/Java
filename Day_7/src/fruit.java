
public class fruit {

	protected String colour;
	private double weight;
	protected String name;
	private boolean fresh;
	
	public fruit(String colour,double weight,String name,boolean fresh)
	{
		this.colour=colour;
		this.weight=weight;
		this.name=name;
		this.fresh=fresh;
	}
	
	
	public boolean isFresh() {
		return fresh;
	}


	public String getColour() {
		return colour;
	}



	public String getName() 
	{
		return name;
	}



	@Override
	public String toString()
	{
		return "colour= "+colour+" weight= "+weight+"g"+" name= "+name+" freshness"+fresh;
	}
	
	public void taste()
	{
		System.out.println("No Specific taste");
	}
	
}
