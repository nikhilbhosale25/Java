package Day_3_BL;

public class Date {

	private int day;
	private int month;
	private int year;
	
	public Date(int day2, int month2, int year2)
	{
		this.day = day2;
		this.month = month2;
		this.year = year2;
	}

	public void displayinfo() {
		//System.out.println("----Entered Date----");
		System.out.print("date of birth= " +this.day+"/");
		System.out.print( this.month+"/");
		System.out.print(this.year);

	}
}
