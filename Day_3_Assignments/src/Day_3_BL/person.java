package Day_3_BL;
public class person 
{
	private String name;
	private int age;
	private String city;
	
	public void setName(String name)
	{
		this.name=name;
		
	}
	public String getName()
	{
		return name;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	
	public person()
	{
		name="Nikhil";
		age=22;
		city="Solapur";
	}
	
	public person(String name,int age,String city)
	{
		this.name=name;
		this.age=age;
		this.city=city;
	}
	
	public void display()
	{
		System.out.println("name= "+this.name);
		System.out.println("age= "+this.age);
		System.out.println("name= "+this.city);
		
	}
	
}
