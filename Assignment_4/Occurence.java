//39.  Write a program to find the no of occurrence for an array element in array.

import java.util.*;

public class Occurence {
    public static void main(String args[]) {

        int n, c = 0, arr[] = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arr[i] = (int) Math.round(Math.random() * 97);
        }

        System.out.println("Values are: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Enter a number to check Occurence: ");
        n = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (n == arr[i]) {
                c++;
            }
        }
        if (c != 0)
            System.out.println("Occurence of " + n + " is : " + c);
        else
            System.out.println(n + " Never Occured..!!");

        sc.close();
    }
}