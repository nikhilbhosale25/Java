
import java.util.Scanner;
public class pattern 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int no=sc.nextInt();
		
		int i,j;
		for(i=0;i<no;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for(i=no-1;i>0;i++)
		{
			System.out.print("*");
		}
		//System.out.print("\n");
		
	}

}