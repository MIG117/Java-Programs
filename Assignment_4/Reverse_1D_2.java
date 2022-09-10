//40.  Reverse the elements in an array of integers using a second array.

import java.util.*;

public class Reverse_1D_2 {
    public static void main(String args[]) {
        int n, arr[], arr2[], i, k = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        arr = new int[n];
        arr2 = new int[n];

        for (i = 0; i < n; i++) { // input
            arr[i] = i * 2;
        }
        System.out.println("Elements are: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        for (i = n - 1; i >= 0; i--) {
            arr2[k++] = arr[i];
        }
        System.out.println("Reverse of array: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}