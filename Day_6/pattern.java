package Day_6;
import java.util.Scanner;
public class pattern 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=sc.nextInt();
		
		int i,j;
		/*for(i=0;i<no;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		*/
		for (i=0; i<n; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
        { 
            System.out.print(" "); //print space
        }  
        for (j=0; j<=i; j++ ) //inner loop for number of columns
        { 
            System.out.print("* "); //print star
        } 

        System.out.println(); //ending line after each row
    } 
	{
	}

}
