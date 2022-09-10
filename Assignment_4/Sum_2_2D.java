// 32.  Write a Java program to calculate Sum of two 2-dimensional arrays.

import java.util.*;

public class Sum_2_2D {
    public static void main(String args[]) {
        int arr[][], arr1[][], sum[][], n, i, j, k = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size of array: ");
        n = sc.nextInt();

        arr = new int[n][n];
        arr1 = new int[n][n];
        sum = new int[n][n];

        for (i = 0; i < n; i++) { // Input in arr
            for (j = 0; j < n; j++) {
                arr[i][j] = k = k + 2;
            }
        }
        k = 0; // reset
        for (i = 0; i < n; i++) { // Input in arr1
            for (j = 0; j < n; j++) {
                arr1[i][j] = k = k + 4;
            }
        }

        for (i = 0; i < n; i++) { // display arr
            for (j = 0; j < n; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println("");
        }

        System.out.println("");

        for (i = 0; i < n; i++) { // display arr1
            for (j = 0; j < n; j++) {
                System.out.print(" " + arr1[i][j]);
            }
            System.out.println("");
        }

        for (i = 0; i < n; i++) { // sum = arr + arr1
            for (j = 0; j < n; j++) {
                sum[i][j] = arr[i][j] + arr1[i][j];
            }
        }
        System.out.println("\nSum of 2 DDA: ");
        for (i = 0; i < n; i++) { // display sum of 2 DDA
            for (j = 0; j < n; j++) {
                System.out.print(" " + sum[i][j]);
            }
            System.out.println("");
        }
        sc.close();
    }
}