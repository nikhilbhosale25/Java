import java.time.LocalDate;
import java.util.List;

public class EmployeeValidation {

	public static Employee ValidateAllEmployee(String id, String firstName, String lastName, String joinDate, double salary,String department,List<Employee> emplist) throws EmployeeException
	{
		LocalDate date=parsejoindate(joinDate);
		Dept dept=parseDept(department);
		return new Employee(id,firstName, lastName,date, salary,dept);
	}
	
	private static LocalDate parsejoindate(String joindate) throws EmployeeException
	{
		LocalDate Joindate=LocalDate.parse(joindate);
		LocalDate curdate=LocalDate.now();
		
		if(Joindate.isBefore(curdate))
		throw new EmployeeException("Invalid Join Date");
		return Joindate;	
	}
	
	private static Dept parseDept(String department)
	{
		Dept dept=Dept.valueOf(department.toUpperCase());
		return dept;
	}
	
	private static void checkforDuplicate(String id,List<Employee> emplist) throws EmployeeException
	{
		Employee newid=new Employee(id);
		for(Employee e: emplist)
		{
			if(e!=null)
				if(e.equals(newid))
					throw new EmployeeException("Duplicate Employee Found");
			System.out.println("No duplicate Employee");
		}	
	}
	
}
