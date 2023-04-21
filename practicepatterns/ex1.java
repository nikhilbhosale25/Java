 package practicepatterns;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        // Taking input arrays a and b
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        // Finding the minimum value of a
        int minA = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < minA) {
                minA = a[i];
            }
        }

        // Performing the required steps to make all a's equal
        int steps = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < n; i++) {
                if (a[i] > minA) {
                    if (a[i] - b[i] >= minA) {
                        a[i] -= b[i];
                    } else {
                        // If it is not possible to make all a's equal
                        System.out.println("-1");
                        return;
                    }
                    flag = true;
                    steps++;
                }
            }
        }

        // Printing the minimum number of steps required
        System.out.println(steps);
    }
}

