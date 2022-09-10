// 8. Write a Java program to find the sum of diagonal elements in a 2D array.

import java.util.*;

public class DiagnolSum {
    public static void main(String args[]) {
        int n = 4, i, j;
        int arr[][] = new int[n][n], sum = 0;

        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 10; i++) {
            for (j = 0; i < n; j++) {

                arr[i][j] = (int) Math.round(Math.random() * 97);
            }
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

    }
}