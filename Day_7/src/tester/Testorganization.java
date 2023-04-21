/*1. Hire Manager
i/p : manager details , except id

2. Hire Worker  
i/p : worker details , except id

3. Display information of all employees(toString) including net salary(computeNetSalary)  using single for-each loop.

4. Update basic salary
i/p : emp id , salary increment
In case of invalid emp id  , either : display error message directly 
OR (still better)
throw custom exception n handle it in centralized manner 
(This can be added later!)

10 Exit
*/
package tester;

import java.util.Scanner;

import com.app.org.Employee;
import com.app.org.mgr;
import com.app.org.worker;

public class Testorganization {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		Employee emp[] = new Employee[size];

		System.out.println("1.Hire Manager");
		System.out.println("2.Hire worker");
		System.out.println("3.Display information of all employees.Including net salary using single for-each loop.");
		System.out.println("4.Update basic salary");
		System.out.println("5.Exit");

		int ch;
		do {

			System.out.print("Enter choice: ");
			ch = sc.nextInt();
			int index = 0;
			switch (ch) {

			case 1:
				if (index < emp.length) {
					System.out.println("Enter Details of mangaer: ");
					System.out.println("Id,firstname,lastname,deptId,basic salary");

					emp[index] = new mgr(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());

					index++;
					System.out.println("manager added sucssesfully");

				} else {
					System.out.println("array is full ");
				}
				break;

			case 2:
				if (index < emp.length) {
					System.out.println("Enter Details of worker: ");
					System.out.println("Id,firstname,lastname,deptId,basic salary");

					emp[index] = new worker(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());
					index++;
					System.out.println("worker added sucssesfully");

				} else {
					System.out.println("array is full ");
				}
				break;

			case 3:
				for (Employee e : emp) {
					if (e != null) {
						System.out.println(e);
						if (e instanceof mgr)
							((mgr) e).toString();

					}

				}
			case 4:
				System.out.println("Enter emplyee id: ");
				int id = sc.nextInt();

				for (Employee e : emp) {
					if (e != null) {
						if (e.getId() == id) {
							System.out.println("Enter amount :");
							double amount = sc.nextDouble();
							e.increment(amount);
						} else {
							System.out.println("Employee not found");
						}
					}
				}
				break;
			case 5:
				System.out.println("****end of menu***");
				break;

			default:
				System.out.println("Enter valid number");
				break;

			}

		} while (ch != 5);

	}

}
