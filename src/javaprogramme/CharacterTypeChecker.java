package javaprogramme;
/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */

import java.util.Scanner;

public class CharacterTypeChecker {

    //Main Method
    public static void main(String[] args) {
        //Calling Method
        checker();
    }

    //checker method
    public static void checker() {
        //opening Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any single Character: ");
        String input = scanner.nextLine();

        //check entered character
        if (input.length() != 1) {
            System.out.println("Please enter only a single character");
        }

        char ch = input.charAt(0);

        if (Character.isDigit(ch)) {
            System.out.println("Entered character is digit.");
        } else if (Character.isAlphabetic(ch)) {
            System.out.println("Entered character is alphabet.");
        } else {
            System.out.println("Entered character is symbol.");
        }


        //close scanner
        scanner.close();
    }
}
