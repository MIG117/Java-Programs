
// 1.  Write a Java program to calculate Sum & Average of an integer array.

import java.util.*;

public class Sum_Avg {
    public static void main(String args[]) {

        int arr[] = new int[10], i, sum = 0, avg;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a elements: ");
        for (i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (i = 0; i < 10; i++) {
            sum = sum + arr[i];
        }
        avg = (sum / 10);

        System.out.println("Sum of the Array elements: " + sum);
        System.out.println("Average of the Array elements: " + avg);

    }
}