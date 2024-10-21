package javaprogramme;
/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class PrintCityNameUsingSwitch {
    public static void main(String[] args) {
        cityFinder();//method calling
    }

    public static void cityFinder() {
        //scanner create
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter letter (A-F) : ");
        //variable declaration
        char letter = Character.toUpperCase(scanner.next().charAt(0));
        String city;
        // Switch statement to find city name
        switch (letter) {
            case 'A':
                city = "Atlanta";
                break;
            case 'B':
                city = "Boston";
                break;
            case 'C':
                city = "Chicago";
                break;
            case 'D':
                city = "Denver";
                break;
            case 'E':
                city = "Edmonton";
                break;
            case 'F':
                city = "Phoenix";
                break;
            default:
                city = "Invalid entry";
        }

        System.out.println(city);

        scanner.close();// scanner close
    }
}
