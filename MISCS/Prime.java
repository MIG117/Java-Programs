
/**/
import java.util.*;

public class Prime {
    public static void main(String args[]) {
        int i, n, flag = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        n = sc.nextInt();

        // for (i = 2; i < n; i++) {
        // if (n % i == 0) {
        // flag = 1;
        // break;
        // }
        // }
        i = 2;
        while (i < n) {
            if (n % i == 0) {
                flag = 1;
                i++;
                break;
            } else {
                i++;
                continue;
            }
        }
        if (flag == 1)
            System.out.println("Not Prime Number");
        else
            System.out.println("Its a Prime Number");

    }
}