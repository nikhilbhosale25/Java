import java.util.Arrays;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		try {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number of students: ");
		int n=sc.nextInt();
		int [] student = new int [n];
		double sum=0;
	
		double [] sum1=new double [n];
		
		for (int i=0; i<student.length; i++)
		{
			
			int count=1;
			System.out.println("Enter"+(i+1)+"st"+"Student details");
			System.out.println("<id>, <name>");
			int id=sc.nextInt();
			String name=sc.next();
			double[] marks = new double [5];
			
			for(int j=0; j<marks.length; j++)
			{
				System.out.println("Enter mark"+count);
				marks[j] = sc.nextDouble();
				count++;
			}
			for(int k=0;k<marks.length; k++)
			{
				 sum= sum + marks[k];
			}
			
			System.out.println("Sum="+sum);
			double avg= sum / 5;
			sum1[i]=avg;
			sum=0;
			System.out.println("average= "+avg);
				
			
		}
		
		Arrays.sort(sum1);
		System.out.println("class topper's avg is: ");
		System.out.println(sum1[n-1]);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
