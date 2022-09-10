// 9. Write a program for Fibonacci series. 

import java.util.*;

public class FibonacciSeries {

    public static void main(String args[]) {
        int n, i, a = 0, b = 1, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a range: ");
        n = sc.nextInt();

        System.out.print(a + " " + b);// printing 0 and 1

        for (i = 2; i <= n; ++i) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}