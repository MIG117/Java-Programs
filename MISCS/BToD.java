
/**/
import java.util.*;

public class BToD {
    public static void main(String args[]) {
        int i = 0, n, r, arr[] = new int[50], sum = 0;
        double s;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        n = sc.nextInt();

        while (n != 0) {
            r = n % 10;
            s = r * Math.pow(2, i);
            arr[i] = (int) s;
            n = n / 10;
            i++;

        }
        i = i - 1;
        while (i >= 0) {
            // System.out.print("" + arr[i]);
            sum = sum + arr[i];
            i--;
        }
        System.out.println("Sum: " + sum);

    }
}