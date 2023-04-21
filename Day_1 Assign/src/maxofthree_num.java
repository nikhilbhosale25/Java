import java.util.Scanner;
public class maxofthree_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no1,no2,no3;
		System.out.println("Enter three numbers to check greatest number: ");
		System.out.println("Enter no1: ");
		no1=sc.nextInt();
		System.out.println("Enter no2: ");
		no2=sc.nextInt();
		System.out.println("Enter no3: ");
		no3=sc.nextInt();
		
		if(no1>no2 && no1>no3)
		{
			System.out.println(no1+" is greatest");
		}
		else if(no2>no1 && no2>no3)
		{
			System.out.println(no2+" is greatest");
		}
		else if(no3>no1 && no3>no2)
		{
			System.out.println(no3+" is greatest");
		}
		else 
		{
			System.out.println("Enter valid number");
		}

	}

}
