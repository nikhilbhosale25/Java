package Day_Alltesters;

import java.util.Scanner;

import Day_3_BL.person;

public class person_tester 
{

	public static void main(String[] args) 
	{
		person p1;
		p1 = new person();
		System.out.println("inside default contr:");
		p1.display();// default constructor

		Scanner sc=new Scanner (System.in);
		person p2;
		System.out.println("\ninside parameterized contr: ");
		System.out.println("Enter name age city");
		p2=new person(sc.next(),sc.nextInt(),sc.next());
		p2.display();
		
		System.out.println("\nUpdate name: ");
		p2.setName(sc.next());

		System.out.println("Update age: ");
		p2.setAge(sc.nextInt());

		System.out.println("Update city: ");
		p2.setCity(sc.next());
		
		System.out.println("\nDetails after update: ");
		p2.display();
		
	}

}
