package practicepatterns;
import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number: ");
		int no =sc.nextInt();
		
		int i,j,s;
		for (i=1;i<=no;i++)
		{
			for (s=1;s<=no-i;s++)
			{
				System.out.print(" ");
			}
			for (j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
