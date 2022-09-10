
//12. Write a program to find all roots of a quadratic equation.
import java.util.*;

public class Quadritic {
    public static void main(String args[]) {
        int a, b, c;
        double d, r1, r2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value in a: ");
        a = sc.nextInt();
        System.out.println("Enter value in b: ");
        b = sc.nextInt();
        System.out.println("Enter value in c: ");
        c = sc.nextInt();

        d = (b * b - 4 * a * c);

        if (d > 0) {
            System.out.println("Roots are equal r1=r2: " + (-b / 2 * a));
            r1 = (-b + Math.sqrt(d)) / 2;
            r2 = (-b - Math.sqrt(d)) / 2;
            System.out.println("The roots are " + r1 + " and " + r2);

        } else if (d == 0) {
            r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("Roots are not possible!");
        }
        sc.close();
    }
}