//

import java.util.*;

public class Element_Deletion {
    public static void main(String args[]) {
        int arr[] = new int[10], i, k = 1, n = 10;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = k++; // sc.nextInt();
        }
        System.out.print("Elements are: ");
        for (i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println("\nEnter the element position want to delete: ");
        int pos = sc.nextInt();

        for (i = pos - 1; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.print("Elements after deletion: ");
        for (i = 0; i < n - 1; i++) {
            System.out.print(" " + arr[i]);
        }

    }
}