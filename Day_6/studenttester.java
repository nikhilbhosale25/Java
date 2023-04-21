package Day_6;
import java.util.Scanner;
public class studenttester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student();
		
		Scanner sc=new Scanner (System.in);
		
		int mark1,mark2,mark3;
		
		System.out.println("Enter mark1-");
		mark1=sc.nextInt();
		
		System.out.println("Enter mark2-");
		mark2=sc.nextInt();
		
		System.out.println("Enter mark3-");
		mark3=sc.nextInt();
		
		s.accept(mark1, mark2, mark3);
		//s.display();
		
		// printing without toString() method gives different output like class name_filename etc.
		//System.out.println(s);
		
		System.out.println(s);// printing with toString()
		
	}

}
