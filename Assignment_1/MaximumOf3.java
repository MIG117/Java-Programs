//4. Write a program to find maximum of three numbers.
public class MaximumOf3 {
    public static void main(String args[]) {
        int a = 43, b = 56, c = 87;
        System.out.println("Value in a = " + a + " b = " + b + " c = " + c);
        if (a > b && a > c) {
            System.out.println("a is greater " + a);
        } else if (b > a && b > c) {
            System.out.println("b is greater " + b);
        } else {
            System.out.println("c is greater " + c);
        }
    }
}
