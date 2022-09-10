// 8. Write a program to calculate factorial of 12. 
public class Factorial12 {
    public static void main(String args[]) {
        int n = 12, i, f = 1;

        for (i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println("Factorial till 12 is:  " + f);

    }
}