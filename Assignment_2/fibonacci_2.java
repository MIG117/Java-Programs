import java.util.*;

public class fibonacci_2 {
    public static void main(String args[]) {
        int n1 = 0, n2 = 1, n3, c = 1, i, n = 15;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        System.out.println(" 0");
        while (c <= n) {

            n3 = n1 + n2;
            System.out.println(" " + n3);
            n1 = n2;
            n2 = n3;
            c++;
        }
    }
}