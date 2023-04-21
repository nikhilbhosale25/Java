package Day_Alltesters;

import java.util.Scanner;

import Day_3_BL.Date;
import Day_3_BL.Employee;

public class Employee_tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp;
		emp = new Employee();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee details: ");
		System.out.println("Enter id : ");
		int id = sc.nextInt();

		System.out.println("Enter name : ");
		String name = sc.next();

		System.out.println("Enter birth date : ");
		//Date dob = null;

		System.out.println("Enter  day : ");
		int day = sc.nextInt();

		System.out.println("Enter  month : ");
		int month = sc.nextInt();

		System.out.println("Enter  year : ");
		int year = sc.nextInt();

		// dob.acceptinfo(day,month,year);

		Date dob = new Date(day, month, year);
		emp.acceptinfo(id, name, dob);

		emp.displayinfo();
		//dob.displayinfo();

		sc.close();
	}

}
