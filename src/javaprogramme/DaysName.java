package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class DaysName {

    public static void main(String[] args) {

        System.out.print("Enter a number (1 to 7) to get the corresponding day of the week: ");
        nameOfDays();// method calling
    }

    public static void nameOfDays() {
        //scanner created
        Scanner scanner = new Scanner(System.in);
        // variable declaration
        int dayNumber = scanner.nextInt();
        String dayName;

        // Switch statement to print the days
        switch (dayNumber) {
            case 1:
                dayName = "MONDAY";
                break;
            case 2:
                dayName = "TUESDAY";
                break;
            case 3:
                dayName = "WEDNESDAY";
                break;
            case 4:
                dayName = "THURSDAY";
                break;
            case 5:
                dayName = "FRIDAY";
                break;
            case 6:
                dayName = "SATURDAY";
                break;
            case 7:
                dayName = "SUNDAY";
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
                return; // Exit the program if input is invalid

        }
        scanner.close();// close scanner
        System.out.println("The day is: " + dayName);
    }

}
