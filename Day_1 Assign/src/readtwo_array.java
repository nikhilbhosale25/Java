import java.util.Scanner;

public class readtwo_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Accept array1: ");
		int arr1[];
		int arr2[];
		int arr3[];
		int size,i;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter size of array1: ");
		size=sc.nextInt();
		arr1=new int [size];
		System.out.println("Enter array1 elements: ");
		for(i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter size of array2: ");
		size=sc.nextInt();
		arr2=new int [size];
		System.out.println("Enter array2 elements: ");
		for(i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}

		int count=0;
		size=arr1.length+arr2.length;
		arr3=new int[size];
		for(i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
			count++;
		}
		
		
		for(i=0; i<arr2.length;i++)
		{
			arr3[count]=arr2[i];
			count++;
			
		}
		for(int r=0;r<arr3.length;r++)
		{
			System.out.print(arr3[r]+" ");
		}
	}

}
