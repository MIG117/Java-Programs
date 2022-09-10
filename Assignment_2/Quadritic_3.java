
import java.util.*;

public class Quadritic_3 {
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

        if (d >= 0) {
            if (d == 0) {
                System.out.println("Roots are equal r1=r2" + (-b / 2 * a));
            } else if (d > 0) {
                System.out.println("Roots are possible" + (-a + b));
                System.out.println("Roots are possible" + (-a - b));
                r1 = (-b + Math.sqrt(d)) / 2;
                r2 = (-b - Math.sqrt(d)) / 2;
                System.out.println("The values of root 1: " + r1);
                System.out.println("The values of root 2: " + r2);
            }
        } else {
            System.out.println("Roots are not possible!");
        }

    }
}