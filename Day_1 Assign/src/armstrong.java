import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number to check armstrong: ");
		Scanner sc = new Scanner(System.in);
		int arm, a, res = 0, i, no, temp;
		no = sc.nextInt();

		temp = no;

		for (i = 1; i <= 3; i++) {
			a = no % 10;

			a = a * a * a;
			res = a + res;
			no = no / 10;
		}

		if (temp == res) {
			System.out.println(temp + " is armstrong number");

		} else {
			System.out.println(temp + " is not armstrong number");
		}

	}

}
