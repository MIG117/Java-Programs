
/*19. Write a program to calculate the exponential of a number. 
*/
import java.util.*;

public class Exponential {
    public static void main(String args[]) {
        int n, p, e;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Base number: ");
        n = sc.nextInt();
        System.out.println("Enter a Power number: ");
        p = sc.nextInt();

        e = (int) Math.pow(n, p);

        System.out.println("Exponential value: " + e);

    }
}