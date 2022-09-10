//

import java.util.*;

public class DDA {
    public static void main(String args[]) {
        int arr[][], n, i, j, sum = 0, k = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        arr = new int[n][n];

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                arr[i][j] = k++;
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println("");
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println("\nSum of DDA: " + sum);

    }
}