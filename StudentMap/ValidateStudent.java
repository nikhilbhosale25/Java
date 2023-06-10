package practice2;

import java.time.LocalDate;
import java.util.Map;

public class ValidateStudent {
	//String id, String name, LocalDate date, String email, Course course, Qualification qualify,
	//double fees
	public static Student validateallstudent(String id,String name,String date,String email,String course, String qualify,double fees) throws StudentException
	{
		
		Qualification qual=validatequalification(qualify);
		Course cs=validatecourse(course);
		LocalDate joindate=validateDate(date);
		return new Student(id,name,joindate,email,cs,qual,fees);
	}
	
	private static Qualification validatequalification(String qualify)
	{
		Qualification Q=Qualification.valueOf(qualify.toUpperCase());
		return Q;
		
	}
	
	private static Course validatecourse(String course)
	{
		Course c=Course.valueOf(course.toUpperCase());
		return c;
	}
	

	private static LocalDate validateDate(String date) throws StudentException
	{
		LocalDate d1=LocalDate.parse(date);
		LocalDate d2=LocalDate.now();
		
		if(d1.isBefore(d2))
		return d1;
		throw new StudentException("Invalid Data");
	}
}
