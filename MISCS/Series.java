
/*1 + (1/1!) + (1/2!) + (1/3!)......(1/n!) */
import java.util.*;

public class Series {
    public static void main(String args[]) {
        int i = 1, n, j, f;
        double sum = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        n = sc.nextInt();

        while (i <= n) {
            f = 1;
            for (j = 1; j <= i; j++) {
                f = f * j;
            }
            sum = sum + 1.0 / f;
            i++;
        }
        System.out.println("Sum of Series: " + sum);

    }
}