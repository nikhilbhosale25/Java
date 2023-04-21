import java.util.Scanner;
public class Sumof_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no,i,even=0,odd=0;
		System.out.println("Enter number: ");
		
		Scanner sc=new Scanner (System.in);
		 no=sc.nextInt();
		 
		 for(i=0;i<=no;i++)
		 {
			 if(i%2==0)
			 {
				 even=i+even; 	 
			 }
			 else if(i%2 != 0)
			 {
				 odd=i+odd;
			 }
		 }
		 System.out.println("Addition of even numbers between 1 to "+no+" = "+even);
		 System.out.println("Addition of odd numbers between 1 to "+no+" = "+odd);
	}

}
