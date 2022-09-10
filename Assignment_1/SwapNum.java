// 5. Write a program to swap two numbers.
public class SwapNum {
    public static void main(String args[]) {
        int a, b, c;
        a = 23;
        b = 43;
        System.out.println("Before Swap");
        System.out.println("a = " + a + " b = " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After Swap");
        System.out.println("a = " + a + " b = " + b);
    }
}
