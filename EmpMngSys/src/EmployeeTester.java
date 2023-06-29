import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeTester {

	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter Filename: ");
			String filename=sc.next();
			List<Employee> emplist=IOUtils.RestoreEmployeeDetails(filename);
			
			boolean exit=false;
			
			try {
			do{
				System.out.println("Enter choice: ");
				int ch=sc.nextInt();
				switch(ch)
				{
				case 1:
						System.out.println("Add new employee: ");
						System.out.println("Enter Employee Details:id,firstName,lastName,joinDate,salary,department");
						Employee emp=EmployeeValidation.ValidateAllEmployee(sc.next(), sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),emplist);
						emplist.add(emp);
						System.out.println("Employee added successfully");
						break;
				case 2:
					System.out.println("Display All Employees: ");
					for(Employee e: emplist)
					{
						System.out.println(e);
					}
					break;
				case 3:
					System.out.println("Enter id to find employee");
					String empid=sc.next();
					emplist.stream().filter(e -> e.getId().equals(empid)).forEach(e -> System.out.println(e));
					break;	
					
				case 4:
					emplist.stream().sorted((e2,e1) -> e1.getJoinDate().compareTo(e2.getJoinDate())).forEach(e -> System.out.println(e));
					break;
					
				case 0:
					IOUtils.StoreEmployeeDetails(filename,emplist);
					exit=true;
					break;
				}
				
				
				
				
			}while(exit!=true);
			
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
		}
	}

}
