//2. Write a Program to display whether a number is odd or even.
public class Even_Odd {
    public static void main(String args[]) {
        int num = 2022;
        System.out.println("Enter a value: " + num);
        if (num % 2 == 0)
            System.out.println(num + " is Even Number");
        else
            System.out.println(num + " is Odd Number");
    }
}
