package practicepatterns;
import java.util.Scanner;
public class pattern1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int no=sc.nextInt();
		int i=0,j,k = 0;
		
		do 
		{ 
				for( j=0;j<=i;j++)
					{
						System.out.print("* ");
					}
					i++;
					System.out.println();
				
			}while(i != 5);	
		
		
		if(i==5)
		{
			for(k=4;k>0;k--)
			{
				for(j=k;j>0;j--)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		
	}

}
