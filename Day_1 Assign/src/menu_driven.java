import java.util.Scanner;
public class menu_driven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0,Qty=0,total=0;
System.out.println("1.'chees pizza' 329rs  2.'chocolava cake' 99rs 3.'Garlic bread' 149rs 4.'coke' 69rs 5.Total bill 6.Exit");
		
		do {
			System.out.println("Enter choice");
			Scanner sc=new Scanner (System.in);
			choice=sc.nextInt();
			
			switch(choice) 
			{
			case 1:
				System.out.println("Enter quantity of chees pizza:");
				Qty=sc.nextInt();
				total+=Qty*329;
				break;
				
			case 2:
				System.out.println("Enter quantity of chocolava cake:");
				Qty=sc.nextInt();
				total+=Qty*99;
				break;
				
			case 3:
				System.out.println("Enter quantity of garlic bread:");
				Qty=sc.nextInt();
				total+=Qty*149;
				break;
				
			case 4:
				System.out.println("Enter quantity of coke:");
				Qty=sc.nextInt();
				total+=Qty*69;
				break;
				
			case 5:
				System.out.println("Total bill:"+total);
				break;
				
			case 6:
				System.out.println("Thank you! Visit again");
				break;
				
			default:
				System.out.println("Enter valid choice");
				break;
			}
			
		}while(choice!=6);
		//sc.close();
	}
}
