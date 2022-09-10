// 28. Write a Java program to check whether a given number is Armstrong Number or not.

import java.util.*;

public class Armstrong {
    public static void main(String args[]) {
        int n, n1, c = 0, cpy, s = 0, r;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        n1 = n;
        cpy = n;

        while (n1 > 0) { // counter
            c++;
            n1 = n1 / 10;
        }

        while (cpy > 0) {
            r = cpy % 10;
            s = s + (int) Math.pow(r, c);
            cpy /= 10;
        }
        if (s == n) {
            System.out.println(s + " is Armstrong Number");
        } else {
            System.out.println(s + " is Not an Armstrong Number");
        }
        sc.close();
    }
}