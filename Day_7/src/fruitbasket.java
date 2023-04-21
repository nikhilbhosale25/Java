import java.util.Scanner;

public class fruitbasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of basket: ");
		int size=sc.nextInt();
		fruit[] type = new fruit[size];

		System.out.println("1.Add Mango");
		System.out.println("2.Add Orange");
		System.out.println("3.Add Apple");
		System.out.println("4.Display names of all fruits in the basket.");
		System.out.println("5.Display name,color,weight , taste of all fresh fruits ,in the basket.");
		System.out.println("6.Mark a fruit in a basket");
		System.out.println("7.Mark all sour fruits stale");
		System.out.println("8.Invoke fruit specific functionality");
		System.out.println("9.Exit");

		int choice = 0;
		boolean fresh = false;
		int index = 0;
		int i=0;
		int k=0;
		do {

			System.out.println("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (index < type.length) {
					System.out.println("Enter mango details: ");
					System.out.println("Enter colour_ weight_ name_freshness");
					mango m = new mango(sc.next(), sc.nextDouble(), sc.next(),sc.nextBoolean());
					//System.out.println(m);
					
					type[index]=m;
					System.out.println("--mango added in basket--");
					index++;
				} else {
					System.out.println("Basket is full---");
				}
				break;

			case 2:
				if (index < type.length) {
					System.out.println("Enter orange details: ");
					System.out.println("Enter colour_ weight_ name_freshness");
					orange o = new orange(sc.next(), sc.nextDouble(), sc.next(),sc.nextBoolean());
					//System.out.println(o);
					type[index]=o;
					System.out.println("--orange added in basket--");
					index++;
				} else {
					System.out.println("Basket is full---");
				}
				break;

			case 3:
				if (index < type.length) 
				{
					System.out.println("Enter Apple details: ");
					System.out.println("Enter colour_ weight_ name_freshness");
					Apple a = new Apple(sc.next(), sc.nextDouble(), sc.next(),sc.nextBoolean());
					//System.out.println(a);
					type[index]=a;
					System.out.println("--Apple added in basket--");
					index++;
				} else {
					System.out.println("Basket is full---");
				}
				break;

			case 4:
				for(fruit f:type)
				{
					if(f!=null) {
						System.out.println(f.getName());
					}
				}
				break;
			case 5:
				for(fruit f:type)
				{
					if(f!=null) {
						System.out.println(f.toString());
						f.taste();
					}
				}
			break;
			
			case 6:
				for(fruit f:type)
				{
					if(f!=null)
					{
						if(f.isFresh()==false)
						{
							System.out.println(f.getName());
						}
					}
				}
				break;
				
			case 7:
				System.out.println("Name of stale fruits:");
				for(k=0;k<index;k++)
				{
					if(type[k]!=null)
					{
						if(type[k].isFresh()==false)
						{
							System.out.println(type[k].getName());
						}
					}
					else {
						System.out.println("array is empty");
					}
				}
				
				break;
				
			case 8:
				System.out.println("enter index");
        		int e=sc.nextInt();
        		for( k=0;k<;k++)
        		{
        			if(k==e)
        		{
        			if(type[e].taste()=="sweet")
        			{
        				m.pulp();	
        			}
        			else if(type[e].taste()=="sour")
        			{
        				O.juice();	
        			}
        			else if(type[e].taste()=="sweet and sour")
        			{
        				a.jam();	
        			}	
        		}
        		}

				break;
			case 9:
				System.out.println("****** End of menu ******");
				
			}

		} while (choice != 9);

	}

	private char[] getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
