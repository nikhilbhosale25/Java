import java.util.Scanner;
public class print_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter number to reverse the series: ");
		int no,i;
		Scanner sc=new Scanner (System.in);
		no=sc.nextInt();
		
		for(i=no;i>=1;i--)
		{
			System.out.print(i+" ");
		}
	}
}
