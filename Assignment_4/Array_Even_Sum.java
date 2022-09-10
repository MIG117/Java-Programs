//35.  Write a Java program to find the sum of even numbers in an integer array.

import java.util.*;

public class Array_Even_Sum {
    public static void main(String args[]) {

        int arr[] = new int[10], sum = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arr[i] = (int) Math.round(Math.random() * 97);
        }

        System.out.println("Values are: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }

        System.out.println("Sum of Even elements of array: " + sum);

        sc.close();
    }
}