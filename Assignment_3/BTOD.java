
// 22. Write a Java program to convert a Binary Number to Decimal.
import java.util.*;

public class BTOD {
    public static void main(String args[]) {
        int i = 0, r, s, sum = 0, n;
        int arr[] = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Binary Number: ");
        n = sc.nextInt();

        while (n != 0) {
            r = n % 10;
            s = r * (int) Math.pow(2, i);
            arr[i] = s;
            n = n / 10;
            i++;
        }
        i = i - 1;
        while (i >= 0) {
            sum = sum + arr[i];
            i--;
        }
        System.out.println(sum);

        sc.close();
    }
}