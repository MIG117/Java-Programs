// 26. Write  a  Java  program  to  read  two  integer  values  m  and  n  and  to  decide  and  print
// whether m is multiple of n.

import java.util.*;

public class mn_multiple {

    public static void main(String args[]) {
        int n, m;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number m: ");
        m = sc.nextInt();
        System.out.print("Enter a number n: ");
        n = sc.nextInt();

        if (m % n == 0) {
            System.out.println("m:" + m + " is Multiple of n:" + n);
        } else {
            System.out.println("m:" + m + " is Not Multiple of n:" + n);
        }
        sc.close();
    }
}