package javaprogramme;
/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class PrintCityName {
    public static void main(String[] args) {
        cityFinder();// method calling
    }

    public static void cityFinder() {
        //scanner create
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a letter (A-F): ");
        //Variable declaration
        char letter = Character.toUpperCase(scanner.next().charAt(0));
        String city;

        // if else condition to print city name
        if (letter == 'A') {
            city = "Atlanta";
        } else if (letter == 'B') {
            city = "Boston";
        } else if (letter == 'C') {
            city = "Chicago";
        } else if (letter == 'D') {
            city = "Denver";
        } else if (letter == 'E') {
            city = "Edmonton";
        } else if (letter == 'F') {
            city = "Phoenix";
        } else {
            city = "Invalid entry";
        }

        System.out.println(city);
        scanner.close();// close scanner
    }
}
