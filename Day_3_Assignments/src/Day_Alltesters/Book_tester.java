package Day_Alltesters;
import java.util.Scanner;

import Day_3_BL.Book;
public class Book_tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1;
		b1=new Book();
		System.out.println("Inside Default contr: ");
		b1.display();
		
		Scanner sc=new Scanner (System.in);
		Book b2;
		System.out.println("Inside Parameterized contr: ");
		System.out.println("Enter book name , book id, author, price:");
		b2=new Book(sc.next(),sc.nextInt(),sc.next(),sc.nextDouble());
		b2.display();
		
		System.out.println("\nUpdate book name: ");
		b2.setName(sc.next());
		
		System.out.println("\nUpdate book id: ");
		b2.setId(sc.nextInt());
		
		System.out.println("\nUpdate author: ");
		b2.setAuthor(sc.next());
		
		System.out.println("\nUpdate price: ");
		b2.setPrice(sc.nextDouble());
		
		System.out.println("\nDetails after update");
		b2.display();	
	}
}
