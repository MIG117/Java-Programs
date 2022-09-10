
// 14. Write a program to print all multiple of 10 between a given interval.
import java.util.*;

public class MultipleOf10 {
    public static void main(String args[]) {
        int n, i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a range: ");
        n = sc.nextInt();

        System.out.print("Multple of 10 are: ");
        for (i = 1; i <= n; i++) {
            if (i % 10 == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();

    }
}