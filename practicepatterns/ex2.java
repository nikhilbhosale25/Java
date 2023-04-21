package practicepatterns;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		String s=sc.nextLine();
		
		System.out.println("Enter starting index: ");
		int n1=sc.nextInt();
		System.out.println("Enter ending index: ");
		int n2=sc.nextInt();
		
		String n=s.substring(n1, n2);
		System.out.println(n);
		

		
		
	}

}
