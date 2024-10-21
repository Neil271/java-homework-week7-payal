package javaprogramme;

import java.util.Scanner;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class NumberCheck {

    public static void main(String[] args) {
        checkNumber();// method calling
    }

    public static void checkNumber() {
        // scanner created
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        //Check the number using Nested if else condition
        if (number > 0) {
            System.out.println("The number is POSITIVE.");
        } else if (number < 0) {
            System.out.println("The number is NEGATIVE.");
        } else {
            System.out.println("The number is ZERO.");
        }
        scanner.close();// scanner close
    }
}

