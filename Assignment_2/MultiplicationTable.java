
// 15. Write a program to generate multiplication table.
import java.util.*;

public class MultiplicationTable {
    public static void main(String args[]) {
        int n, i;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        n = sc.nextInt();

        for (i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " : " + (n * i));
        }

    }
}