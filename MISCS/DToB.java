
/**/
import java.util.*;

public class DToB {
    public static void main(String args[]) {
        int i = 0, n, r, arr[] = new int[50];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Decimal number: ");
        n = sc.nextInt();

        while (n != 0) {
            r = n % 2;
            arr[i] = r;
            n = n / 2;
            i++;

        }
        i = i - 1;
        while (i >= 0) {
            System.out.print("" + arr[i]);
            i--;
        }

    }
}