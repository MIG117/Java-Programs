//7. Write a program to check whether a year is leap year or not.
public class LeapYear {
    public static void main(String args[]) {
        int year = 2004;
        System.out.println("Year is: " + year);
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Its a Leap year " + year);
        } else {
            System.out.println("Its Not a Leap year " + year);
        }
    }
}