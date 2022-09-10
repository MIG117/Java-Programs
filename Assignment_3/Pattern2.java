/*
 30.           
       1
     2 1 2
   3 2 1 2 3
 4 3 2 1 2 3 4
 */

public class Pattern2 {
    public static void main(String args[]) {

        int n, i, j, k, l;
        n = 4;

        for (i = 1; i <= n; i++) {

            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (k = i; k >= 1; k--) { // 1st Half Print
                System.out.print(k);
            }
            for (l = 2; l <= i; l++) { // 2nd Half Print
                System.out.print(l);
            }
            System.out.println();
        }

    }

}