package practice2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentTester {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			
			System.out.println("Enter filename");
			String filename=sc.next();
			Map<String,Student> Maplist=Utils.restoreDetails(filename);
			System.out.println("Data restored successfully");
			
			boolean exit=false;
			try {	
				do {
					System.out.println("Enter choice");
					int ch=sc.nextInt();
					
					switch(ch)
					{
						
					case 1:
						System.out.println("Enter Student Details: id,name,joindate,email,cs,qual,fees");
						Student s1=ValidateStudent.validateallstudent(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble());
						Maplist.put(s1.getId(), s1);
						break;
						
					case 2:
						Maplist.forEach((k,v)->System.out.println(v));
						break;
						
					case 3:
						
						//Maplist.values().stream().filter((s1,s2)->)
						
						break;
						
					case 0:
						exit=true;
						
						Utils.storeDetails(filename, Maplist);
						System.out.println("Data stored successfully");
						break;
					}
					
					
					
				}while(!exit);
				
				
				
			}catch (Exception e) 
			{			
				e.printStackTrace();
			}
			
			
			
			
			
 		}

	}

}
//1 nikhil 2020-02-15 nik@123 dac be 70000
//2 shashi 2020-03-01 shashi@gmail dac be 750000
