package practicepatterns;
import java.util.Scanner;
public class pattern2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number: ");
		int no =sc.nextInt();
		int i,j;
		for(i=no;i>0;i--)
		{
			for(j=i;j>0;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
