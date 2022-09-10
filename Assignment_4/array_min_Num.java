// 38.  Write a Java program to enter n elements in an array and find smallest number among them.

import java.util.*;

public class array_min_Num {
    public static void main(String args[]) {
        int n, i, min = 0, arr[];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        arr = new int[n];

        System.out.print("Enter elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        min = arr[0];

        for (i = 0; i < n; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }

        System.out.println("Smallest Number in array: " + min);

    }
}