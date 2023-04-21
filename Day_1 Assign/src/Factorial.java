import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
		System.out.println("Enter number to find factorial");
		
		Scanner sc=new Scanner(System.in);
	
		int no=sc.nextInt();
		int ans=1;
		for(int i=1;i<=no;i++)
		{
			
			ans=ans*i;
		
	    }
		System.out.println("factorial of "+no+"= "+ans);
		
	}
}
