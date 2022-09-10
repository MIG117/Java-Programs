
// 13. Write a program to calculate the sum of natural numbers up to a certain range.
import java.util.*;

public class SumOfrange {
    public static void main(String args[]) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a range: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum of " + n + " range is: " + sum);

        sc.close();
    }
}