//

import java.util.*;

public class ArrayPrint {
    public static void main(String args[]) {
        int arr[] = new int[50], i, n, k = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Elements are: ");

        for (i = 0; i < 10; i++)
            arr[i] = k++;

        for (i = 0; i < 50; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}