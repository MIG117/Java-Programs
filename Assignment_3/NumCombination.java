
// 25. Write a Java program to generate all combination of 1, 2, or 3 using loop.
import java.util.*;

public class NumCombination {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (i != j && j != k && i != k) {
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
        sc.close();
    }
}