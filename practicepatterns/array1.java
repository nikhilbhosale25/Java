package practicepatterns;
import java.util.Scanner;
public class array1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many arrays you want to create:- ");
		int no=sc.nextInt();
		int i,j;
		int [] arr1 = null;
		for(i=0;i<no;i++)
		{
			System.out.println("Enter the size of array"+i);
			int size=sc.nextInt();
			 arr1=new int [size];
			System.out.println("Enter elements in array"+i);
			for(j=0;j<arr1.length;j++)
			{
				 arr1 [j]=sc.nextInt();
			}
			
		}
		System.out.println("---------------------------");
		System.out.println("Enter number of queries:-");
		int q=sc.nextInt();
		for(int k=0;k<q;k++)
		{
			System.out.println("In which array your element is:-");
			int a=sc.nextInt();
			System.out.println(arr1[a]);
		}

	}

}
