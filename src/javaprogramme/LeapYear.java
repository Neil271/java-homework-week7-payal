package javaprogramme;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

public class LeapYear {
    public static void main(String[] args) {
        yearLeap();// method calling
    }

    public static void yearLeap() {
        // scanner create
        Scanner in = new Scanner(System.in);
        System.out.println(" Input the year : ");
        int year = in.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        // if else statement to find leap year
        if (x && (y || z)) {
            System.out.println(year + " is a leap year ");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
