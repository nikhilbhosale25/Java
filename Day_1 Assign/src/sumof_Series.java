import java.util.Scanner;
public class sumof_Series {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int no,i,sum=0;
		System.out.println("Enter number: ");
		
		Scanner sc=new Scanner(System.in);
		
		no=sc.nextInt();
		
		for(i=1;i<=no;i++)
		{
			sum=sum+i;
		}
		System.out.println("Additon of number 1 to "+no+" = "+sum);
	}

}
