//

import java.util.*;

public class DDA_Multiplication {
    public static void main(String args[]) {
        int arr[][], arr2[][], a[][], n, i, j, mul = 0, k = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        arr = new int[n][n];
        arr2 = new int[n][n];
        a = new int[n][n];

        for (i = 0; i < n; i++) { // 1st DDa
            for (j = 0; j < n; j++) {
                arr[i][j] = k++;
            }
        }

        k = 10;
        for (i = 0; i < n; i++) { // 2nd DDA
            for (j = 0; j < n; j++) {
                arr2[i][j] = k++;
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(" " + arr[i][j]); // Print 1 DDA
            }
            System.out.println("");
        }
        System.out.println("");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(" " + arr2[i][j]); // Print 2 DDA
            }
            System.out.println("");
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                for (k = 0; k < n; k++) {
                    a[i][j] = a[i][j] + arr[i][k] * arr2[k][j];
                }
            }
        }
        System.out.println("\nMultiplication of  DDA: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println("");
        }
    }
}