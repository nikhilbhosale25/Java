package com.app.tester;

import java.util.Scanner;
import com.app.fruit.Fruit;
import com.app.fruit.Orange;
import com.app.fruit.mango;
import com.app.fruit.Apple;

public class Fruittester {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter size of your basket: ");
		Fruit [] basket = new Fruit[sc.nextInt()];
		
		System.out.println("1.Add mango in your basket");
		System.out.println("2.Add Orange in your basket");
		System.out.println("3.Add Apple in your basket");
		System.out.println("4.Display names of all fruits in your basket");
		System.out.println("5.Display name,color,weight and taste of all fresh fruits");
		System.out.println("6.Mark a fruit in a basket as Stale(=not fresh)");
		System.out.println("7.Mark all sour fruits stale");
		System.out.println("8.Invoke fruit specific functionality (pulp / juice / jam)");
		System.out.println("9.Exit");

		int ch;
		int counter= 0;
		do {
			
			System.out.println("Enter choice : ");
			ch= sc.nextInt();
			
			switch (ch)
			{
			case 1:// Add mango
				System.out.println("Enter <name> <color> <weight>");
				if(counter < basket.length)
				{
					basket[counter] =new mango(sc.next(),sc.next(),sc.nextDouble());
					counter++;
				}
				else
				{
					System.out.println("Basket is full");
				}
				break;
			case 2:
				System.out.println("Enter <name> <color> <weight>");
				if(counter < basket.length)
				{
				basket[counter] =new Orange(sc.next(),sc.next(),sc.nextDouble());
				counter++;
				}
				else
				{
					System.out.println("Basket is full");
				}
				break;
			case 3:
				System.out.println("Enter <name> <color> <weight>");
				if(counter < basket.length)
				{
				basket[counter] =new Apple(sc.next(),sc.next(),sc.nextDouble());
				counter++;
				}
				else
				{
					System.out.println("Basket is full");
				}
				break;
			case 4:
				System.out.println("Name of fruits you have in your basket");
				for (Fruit f : basket)
				{
					if(f != null)
					{
						System.out.println("->"+f.getName());
					}
				}
				break;
			case 5:
				System.out.println("You have " +counter+" Fruits in your baskte:-");
				for (Fruit f : basket)
				{
					if(f != null)
					{
						System.out.println(f.toString()+" taste: "+f.taste());
					}
				}
				break;
			case 6:
				System.out.println("Enter index to mark fruit stale");
				int index=sc.nextInt();
				if(index >= 0 && index <= counter)
					{
						System.out.println("mark fruit");
						basket[index].setFresh(sc.nextBoolean());
						System.out.println(basket[index].getName()+" is stale");
					}
				else {
					System.out.println("Index not found");
				}
				
				break;
			case 7:
				int i=0;
				for(Fruit f: basket)
				{
					if(basket[i] != null)
					{
						if((f.taste().toLowerCase()).equals("sour"))
						{
							System.out.println(f.getName()+" is stale because it is sour");
						}
					}
					i++;
				}
				break;
			case 8:
				for(Fruit f : basket)
				{
					if(f != null)
					{
						if(f instanceof mango)
						{
						   ((mango) f).pulp();
						}
						else if (f instanceof Orange)
						{
							((Orange)f).juice();
						}
						else if(f instanceof Apple)
						{
							((Apple) f).jam();
						}
						
					}
				}
				
				break;
			case 9:
				System.out.println("-------Exit------");
				break;
			default:
				System.out.println("----Enter valid choices ----");
			
				break;
			}
			
		}while(ch != 9);

		
	}

}
