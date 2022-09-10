//3. Write a Program to check if a number is Positive or Negative. 
public class PositiveNegative {
    public static void main(String args[]) {
        int n;
        n = 34;
        System.out.println("Enter a number: " + n);
        if (n == 0) {
            System.out.println(n + " is Non-negative and Non-positive");
        } else if (n > 0) {
            System.out.println(n + " is Positive Number");
        } else {
            System.out.println(n + " is Negative Number");
        }
    }
}
