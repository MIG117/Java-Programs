
/*1. Admission to a professional course is subject to the following conditions: 
(a) marks in Mathematics >= 60 
(b) marks in Physics >=50 
(c) marks in Chemistry >=40 
(d) Total in all 3 subjects >=200 (Or) Total in Maths & Physics>=150 
Given the marks in the 3 subjects of n (user input) students, 
write a program to process the applications to list the eligible candidates. */

import java.util.*;

public class Admission {
    public static void main(String args[]) {
        int p, c, m, tot;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks  of Maths: ");
        m = sc.nextInt();
        System.out.println("Enter marks  of Physics: ");
        p = sc.nextInt();
        System.out.println("Enter marks  of Chemistry: ");
        c = sc.nextInt();

        tot = p + c + m;

        if (!(tot > 300)) {
            if ((m >= 60 && p >= 50 && c >= 40 && tot >= 200) || (m + p) >= 150) {
                System.out.println("Student is Eligible\nTotal Marks: " + tot);
            } else {
                System.out.println("Student is not Eligible\nTotal Marks: " + tot);

            }
        } else {
            System.out.println("Invalid Marks entered..!!");
        }
        sc.close();

    }
}