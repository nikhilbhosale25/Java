import java.util.Scanner;
public class Add_two_numbers {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int no1,no2,ans;
		
		System.out.println("Enter two numbers for addition");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No1: ");
		 no1=sc.nextInt();
		System.out.println("Enter No2: ");
		no2=sc.nextInt();
		
	      ans=no1+no2;
		
System.out.println(no1+"+"+no2+" ="+ans);
	}

}
