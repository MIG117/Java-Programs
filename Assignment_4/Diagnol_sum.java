// 36.  Write a Java program to find the sum of diagonal elements in a 2D array.

import java.util.*;

public class Diagnol_sum {
    public static void main(String args[]) {
        int n, arr[][], i, j, ld = 0, rd = 0, k = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        n = sc.nextInt();

        arr = new int[n][n];

        for (i = 0; i < n; i++) { // Input
            for (j = 0; j < n; j++) {
                arr[i][j] = k += 2;
            }
        }

        for (i = 0; i < n; i++) { // Sum of right Diagnol
            for (j = 0; j < n; j++) {
                if (i == j)
                    rd = rd + arr[i][j];
            }
        }

        for (i = 0; i < n; i++) { // Sum of Left Diagnol
            for (j = 0; j < n; j++) {
                if ((i + j) == n - 1)
                    ld = ld + arr[i][j];
            }
        }

        for (i = 0; i < n; i++) { // Input
            for (j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("\nSum of Right Diagnol: " + rd);
        System.out.println("Sum of Left Diagnol: " + ld);

    }
}