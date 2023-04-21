package practicepatterns;
import java.util.Scanner;
public class pattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number: ");
		int no=sc.nextInt();
		
		for(int i = 0; i<no; i++)
		{
			for(int j=i; j<no;j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	
	}

}
