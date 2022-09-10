
// 10. Write a program to reverse a number.
import java.util.*;

public class ReverseNum {
    public static void main(String args[]) {
        int n, r, s = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();
        System.out.println("Original Number: " + n);

        while (n > 0) {
            r = n % 10;
            s = (s * 10) + r;
            n /= 10;
        }
        System.out.println("Reversed Number: " + s);
    }
}