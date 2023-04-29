import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int a;
		int sum=0;
		int temp=num;
		while(num>0)
		{
			 a = num%10;
			 sum = sum + a;
			 num=num/10;
		}
		
		System.out.println("Sum of "+temp+" is "+sum);

	}

}
