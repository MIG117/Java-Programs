public class factorial_1 {
    public static void main(String args[]) {
        int n = 12;
        long f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println("Factorial of " + n + " is " + f);
    }
}