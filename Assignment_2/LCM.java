
// 17. Write a program to find LCM of two Numbers.
import java.util.*;

public class LCM {
    public static void main(String args[]) {
        int a, b, max, step, lcm = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();

        if (a > b) {
            max = step = a;
        } else {
            max = step = b;
        }

        while (a != 0) {
            if (max % a == 0 && max % b == 0) {
                lcm = max;
                break;
            }
            max = max + step;
        }
        System.out.println("LCM of given numbers is: " + lcm);

    }
}