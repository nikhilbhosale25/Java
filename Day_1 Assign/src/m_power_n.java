import java.util.Scanner;
public class m_power_n 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number to find power:");
		//Scanner sc=new Scanner (System.in);
		int no=sc.nextInt();
		
		System.out.println("Enter Power:");
		int pow=sc.nextInt();
		
		int ans=1;
		for(int i=1;i<=pow;i++)
		{
			ans*= no;
		}
		System.out.println("power of"+no+"= "+ans);
	}
}
