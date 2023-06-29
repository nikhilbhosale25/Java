package com.tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static com.validation.StudentValidationRules.*;
import com.app.Student;

public class StudentTester {

	public static void main(String[] args) {

		try(Scanner sc=new Scanner (System.in))
		{
			
			Map<Integer,Student> studmap=new HashMap<>();
			
			boolean exit=false;
			
			try {
				do {
					
					System.out.println("Enter Choices: ");
					int ch=sc.nextInt();
					
					switch(ch)
					{
					case 1:
						//int id, String firstname, String lastname, String email, String dob,String course
						Student s1=ValidateAllStudents(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next());
						studmap.put(s1.getId(), s1);
						break;
					case 2:
						for(Student s: studmap.values())
						{
							System.out.println(s);
						}
						break;
					case 0:
						exit=true;
						break;
					}
					
				}while(exit != true);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}

	}

}
