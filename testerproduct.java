package problem2;

import java.util.Scanner;

public class testerproduct {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		category[] c = category.values();

		System.out.println("Define shop size: ");
		int size = sc.nextInt();
		product[] shop = new product[size];

		System.out.println("***products categories***");
		for (category p1 : c)
		{
			System.out.println("-> " + p1);
		}
		
		System.out.println("**************");
		System.out.println("1.Add product");
		System.out.println("2.Display all products");
		System.out.println("3.show specific product by id");
		System.out.println("4.show all product price > 100");
		System.out.println("5.accept category from user and show only matched products");
		System.out.println("-------------------------------------------------");
		int ch;
		int i=0;
		
		do {
			
			System.out.println("Enter choice: ");
			ch = sc.nextInt();

			switch (ch) {

			case 1:
				System.out.println("Enter:product id,name,price,categor");
				if(i < shop.length)
				{
					shop [i] = new product(sc.nextInt(), sc.next(), sc.nextDouble(),category.valueOf(sc.next().toLowerCase()));
					i++;
				}
				break;
			case 2:
				for (product p : shop)
				{
					if(p!=null)
					System.out.println(p);
				}
				break;
			case 3:
				boolean flag = false;
				
				System.out.println("Enter product id to get product details:");
				int id=sc.nextInt();
				int count=0;
				for(product p : shop)
				{
					
					if(p.getPid() == id)
					{
						flag =true;
						break;
					}
					else
					{
						flag = false;
					}
					count++;
				}
				
				if(flag == true)
				{
					System.out.println(shop[count]);
				}
				else
				{
					System.out.println("Enter correct id");
				}
				break;
			case 4:
				
				for(product p :shop)
				{
					if(p!=null)
					{
						if (p.getPrice() > 100)
						{
							System.out.println(p);
						}
					}	
			   }
				break;
			case 5:
				System.out.println("Enter category to see same category products:");
				category cat = category.valueOf(sc.next().toLowerCase());
				
				for(product p : shop)
				{
					if(p != null)
					{
					if(p.getCname() == cat)
					{
						System.out.println(p);
					}
					}
				}
				break;
		}

		} while (ch != 5);

	}

}
