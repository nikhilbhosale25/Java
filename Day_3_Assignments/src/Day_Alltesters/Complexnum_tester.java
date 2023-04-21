package Day_Alltesters;

import java.util.Scanner;

import Day_3_BL.complexnumber;

public class Complexnum_tester {

	public static void main(String[] args) {

		complexnumber c1=new complexnumber();
		System.out.println("inside default contr: ");
		c1.display();
		
		Scanner sc=new Scanner (System.in);
		System.out.println("\ninside parameterized contr: ");
		System.out.println("Enter real number: ");
		int real=sc.nextInt();
		
		System.out.println("Enter imaginary number: ");
		int imag=sc.nextInt();
		
		complexnumber c2=new complexnumber(real,imag);
		c2.display();
		
		System.out.println("change real number: ");
		c2.setReal(sc.nextInt());

		System.out.println("change imag number: ");
		c2.setImag(sc.nextInt());
		System.out.print("After Update complex number= "+c2.getReal()+"+"+c2.getImag()+"i");		
		
	}
}
