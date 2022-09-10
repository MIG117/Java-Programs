
// 24. Write a program to compute the value of Euler’s number that is used as the base of
//     natural logarithms.Use the following formula.e=1+1/1!+1/2!+1/3+................1/n!

import java.util.*;

public class EulerSeries {
    public static void main(String args[]) {

        int fact = 1, n;
        double sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            fact = fact * i; // Update factorial
            sum = sum + 1.0 / fact; // Update series sum
        }

        System.out.println("Sum of Series: " + sum);

        sc.close();
    }
}