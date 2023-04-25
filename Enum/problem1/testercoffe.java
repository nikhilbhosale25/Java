
import java.util.Scanner;

public class testercoffe {

	public static void main(String[] args) {
		
		System.out.println("----Coffe Menu----");

		coffetype [] coffeshop = coffetype.values();
		
	
		for(coffetype c: coffeshop )
		{
			System.out.println(c);
		}
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter your choice: ");
		
		coffetype c=coffetype.valueOf(sc.next().toLowerCase());
		
		System.out.println("your order= "+c);
		
		
		
	}

}
