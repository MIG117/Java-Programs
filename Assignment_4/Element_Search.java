// 34.  Write a Java program to search an element in an array.

import java.util.*;

public class Element_Search {
    public static void main(String args[]) {
        int n, arr[] = new int[10];
        int flag = 0, pos = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arr[i] = (int) Math.round(Math.random() * 97);
        }

        System.out.println("Values are: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Enter a number to search: ");
        n = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (n == arr[i]) {
                flag = 1;
                pos = i + 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Search Found!\nPosition is: " + pos);
        } else {
            System.out.println("Search Not Found!");
        }

        sc.close();

    }
}