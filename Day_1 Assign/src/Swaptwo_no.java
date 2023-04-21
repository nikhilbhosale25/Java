import java.util.Scanner;
public class Swaptwo_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1,no2,temp;
		
		System.out.println("Enter Two numbers to swap: ");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1: ");
		no1=sc.nextInt();
		
		
		System.out.println("Enter number 2: ");
		no2=sc.nextInt();
		
		System.out.println("no1 before Swap="+no1);
		System.out.println("no2 before Swap="+no2);
		
		temp=no1;
		no1=no2;
		no2=temp;
	
		
		System.out.println("\nAfter Swap no1="+no1);
		System.out.println("After Swap no2="+no2);
		
	}

}
