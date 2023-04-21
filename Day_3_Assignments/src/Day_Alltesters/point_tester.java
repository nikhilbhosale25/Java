package Day_Alltesters;
import java.util.Scanner;

import Day_3_BL.Point;
public class point_tester {

	public static void main(String[] args) {
		
		Point p1;
		p1=new Point();
		System.out.println("inside Default constr: ");
		p1.display();

		System.out.println("\nInside parameterized constr: ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr X: ");
		int x=sc.nextInt();
		
		System.out.println("Enetr Y: ");
		double y=sc.nextDouble();
		
		Point p2=new Point(x,y);
		p2.display();
		
		System.out.println("Change X and Y: ");
		p2.setX(sc.nextInt());
		p2.setY(sc.nextDouble());
		
		System.out.println("updated X and Y: ");
		System.out.println(p2.getX());
		System.out.println(p2.getY());
		
	}

}
