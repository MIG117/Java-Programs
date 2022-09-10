
// 21. Write a program to check whether a number is prime or not.
import java.util.*;

public class Prime {
    public static void main(String args[]) {
        int n, i, flag = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        n = sc.nextInt();

        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println(n + " Not a Prime Number");
        } else {

            System.out.println(n + " is Prime Number");
        }
        sc.close();
    }
}