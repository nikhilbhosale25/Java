package Day_3_BL;
public class Employee {

	private int id;                          
	private String name;
	private Date dob;
	
	public void acceptinfo(int id,String name,Date dob)
	{
		this.id=id;
		this.name=name;
		this.dob=dob;
		
	}

	public void displayinfo()
	{
		System.out.println("----Emplyee Details----");
		System.out.println("id ="+this.id);
		System.out.println("name ="+this.name);
		dob.displayinfo();
		
	}
}
