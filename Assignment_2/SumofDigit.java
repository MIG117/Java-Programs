/**/
import java.util.*;
public class SumofDigit
{
    public static void main(String args[])
    {
        
        int n,r,s=0;
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a number: ");
        n = sc.nextInt();
        int cpy=n;

        while(cpy!=0)
        {
            r = cpy % 10;
            s = s + r;
            cpy=cpy/10;
        }
        System.out.println("Sum of digit: "+s);

    }
}