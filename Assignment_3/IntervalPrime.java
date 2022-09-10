//27. Write a Java program to display prime numbers between a given interval.

import java.util.*;

public class IntervalPrime {
    public static void main(String args[]) {

        int i, j, isPrime, n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a range: ");
        n = sc.nextInt();

        System.out.println("All Prime Numbers Between 1 to 100");

        for (i = 2; i <= n; i++) {
            isPrime = 0;
            for (j = 2; j <= i / 2; j++) {

                if (i % j == 0) {
                    isPrime = 1;
                    break;
                }
            }

            if (isPrime == 0) {

                System.out.print(i + " ");
            }
        }

    }
}