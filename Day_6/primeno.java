package Day_6;
import java.util.Scanner; 
public class primeno {

	public static void main(String[] args)
	{
		int no=0,i;
		boolean prime= true;
		System.out.println("Enter any number: ");
		
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		int count=0;
		for(i=1;i<=no;i++)
		{
			 //count =0;
			if (no%i == 0)
			{
				count++;
				//break;
			}
		}
		if (count == 2)
		{
			System.out.println(no+" is a prime number.");
		}
		else
		{
			System.out.println(no+" is not prime number.");
		}
		

	}

}
