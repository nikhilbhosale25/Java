import java.util.Scanner;
public class Primeornot 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number to check prime or not:");
		
		
		int no=sc.nextInt();
		int b=0;
		
		for(int i=2;i<no;i++)
		{
			
			if(no%i==0)
			{
				b++;
				//System.out.println("Number is not prime:");
				break;
			}
		
		}
		if(b!=0)
		System.out.println("Number is not prime");
		else
		{
			System.out.println("Number is prime");
		}
	}
}
