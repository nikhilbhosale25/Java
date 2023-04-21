package practicepatterns;
import java.util.Scanner;
public class pattern6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("define size of an array");
		int size1=sc.nextInt();
		int [] arr =new int [size1];
		
		System.out.println("define size of an array 2");
		int size2=sc.nextInt();
		int [] arr2 =new int [size2];
		
		int i,j;
		int temp;
		System.out.println("Enter array elements: ");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter array elements for 2nd aray: ");
		for(i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
//		System.out.println("After sorting the array elements in ascending order: ");
//		for(i=0;i<arr.length;i++)
//		{
//			for(j=i+1;j<arr.length;j++)
//			{
//				if(arr[i] > arr[j])
//				{
//					 temp=arr[i];
//					 arr[i]=arr[j];
//					 arr[j]=temp;
//				}
//			}
//		}
//		System.out.println("Entered array elements are: ");
//		
//		for(i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]+" ");
//		
//		}
//		System.out.println("\nMinimum value of an array = "+arr[0]);
//		
//		System.out.println("Maximum value of an array = "+arr[arr.length-1]);
//		
		
//		System.out.println("duplicate elements in array: ");
//		for(i=0;i<arr.length;i++)
//			{
//				for(j=i+1;j<arr.length;j++)
//				{
//					if(arr[i] == arr[j])
//					{
//						 System.out.print(arr[i]+" ");
//					}
//				}
//			}

		System.out.println("common elements in both arrays : ");
		
		for(i=0;i<arr.length;i++)
		{
			for (j=0;j<arr2.length;j++)
			{
				if(arr[i] == (arr [j]))
				{
					System.out.println(arr[i]);
				}
			}
		}
		
	}

}
