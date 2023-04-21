package Day_6;
import java.util.Scanner;
public class Arraysearch {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter size of array:");
		int a[]=new int[sc.nextInt()];
		
		System.out.println("Enter Array Elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter any number to search in array: ");
		int no=sc.nextInt();
		int i;
		boolean flag=false; 
		for(i=0;i<a.length;i++)
		{
			if (a[i]==no)
			{
				flag=true;
				break;
			}
		}
		if (flag == true)
		{
			System.out.println(no+" is present in index "+i);
		}
		else
			System.out.println("Number is not present");
		
		System.out.println("Enter index to Update the number: ");
		int index=sc.nextInt();
		System.out.println("Enter update number: ");
		for(i=0;i<a.length;i++)
		{
			if(i==index)
			{
				a[i]=sc.nextInt();
			}
		}
		
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Sorting of array in ascending order: ");
		for(i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		
		for(int k=0; k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	}

}
