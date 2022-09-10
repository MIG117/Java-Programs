
// 20. Write a program to check whether a number is palindrome or not.
import java.util.*;

public class Palindrome {
    public static void main(String args[]) {
        int n, n1, s = 0, r;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        n = sc.nextInt();
        n1 = n;
        while (n > 0) {
            r = n % 10;
            s = (s * 10) + r;
            n = n / 10;
        }
        if (s == n1) {
            System.out.println(n1 + " Palindrome");
        } else {
            System.out.println(n1 + " Not Palindrome");
        }

    }
}