import java.util.Scanner;
public class array_menudriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(
				"1:Read Array 2:Print Array 3:Search element in array 4:Reverse Array 5:Even number from array 6:sum of array element ");

		int choice, i, no,total=0;
		int arr[] = null;
		boolean a = false;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter size of your array:");
				int size = sc.nextInt();
				arr = new int[size];
				System.out.println("Enter array elements :");
				for (i = 0; i < arr.length; i++) {
					arr[i] = sc.nextInt();
				}
				break;

			case 2:
				System.out.println("Your array elemnts are:");
				for (i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
				break;

			case 3:
				System.out.println("Enter number to search in your array: ");
				no = sc.nextInt();
				for (i = 0; i < arr.length; i++) {
					if (arr[i] == no) 
					{
						a = true;
						break;
					} else {
						a = false;
					}

				}
				if (a == true) {
					System.out.println(no + " is present");
				} else {
					System.out.println(no + " is not present");
				}
				break;
				
			case 4:
				System.out.println("Reverse of array :");
				for(i=arr.length-1;i>=0;i--)
				{
					System.out.println(arr[i]);
				}
			
				break;
			
			case 5:
				System.out.println("Even number in your array: ");
				for(i=0;i<arr.length;i++)
				{
					if(arr[i]%2==0)
					{
						System.out.println(arr[i]);
					}
				}
				break;
			case 6:
				System.out.println("Sum of array elements: ");
				for(i=0;i<arr.length;i++)
				{
					total+=arr[i];
				}
				System.out.println("Sum = "+total);
				break;
			default:
				System.out.println("Enter valid choice...");
		}
		}while (choice !=6);
		
	}
}