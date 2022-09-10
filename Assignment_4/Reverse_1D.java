// 37.  Reverse the elements in an array of integers without using a second array.

import java.util.*;

public class Reverse_1D {
    public static void main(String args[]) {
        int n, arr[], i, j, temp = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        arr = new int[n];

        for (i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        System.out.println("Elements are: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        i = 0;
        j = n - 1;
        while (i < j) {
            // swap
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.println("Reverse of array: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}