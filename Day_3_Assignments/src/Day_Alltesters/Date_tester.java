package Day_Alltesters;

import java.util.Scanner;

import Day_3_BL.Date;

public class Date_tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter day : ");
		int day = sc.nextInt();
		System.out.println("Enter month : ");
		int month = sc.nextInt();
		System.out.println("Enter year : ");
		int year = sc.nextInt();

		Date d=new Date(day,month,year);
		d.displayinfo();

		sc.close();
	}
}
