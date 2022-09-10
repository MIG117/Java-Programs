
// 21. Write a Java program to convert a Decimal to Binary.

import java.util.*;

public class DTOB {
    public static void main(String args[]) {
        int n, i = 0, r, arr[] = new int[50];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Decimal number: ");
        n = sc.nextInt();

        while (n != 0) {
            r = n % 2;
            arr[i] = r;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(arr[j]);
        sc.close();
    }
}