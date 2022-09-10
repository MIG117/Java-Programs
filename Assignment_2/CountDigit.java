// 18. Write a program to count the number of digits of an integer. 

import java.util.*;

public class CountDigit {
    public static void main(String args[]) {
        int n, c = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        n = sc.nextInt();

        while (n > 0) {
            c++;
            n = n / 10;

        }
        System.out.println("Number of Digit: " + c);
    }
}