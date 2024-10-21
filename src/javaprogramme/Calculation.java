package javaprogramme;

import java.util.Scanner;

/*
Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)
 */
public class Calculation {
    //Main Method
    public static void main(String[] args) {

        //call calculation method
        calculation();
    }

    //calculation Method
    public static void calculation() {
        //create scanner
        Scanner scanner = new Scanner(System.in);

        //take input from user
        System.out.println("Please enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter number 2: ");
        int num2 = scanner.nextInt();
        System.out.println("Please enter the symbol (+, -, /, *) to perform calculation.");
        String sym = scanner.next();

        //Calculation
        if (sym.equals("+")) {
            System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1 + num2));
        } else if (sym.equals("-")) {
            System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2));
        } else if (sym.equals("/")) {
            System.out.println("Division of " + num1 + " and " + num2 + " is " + (num1 / num2));
        } else if (sym.equals("*")) {
            System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
        } else {
            System.out.println("Please enter valid symbol.");
        }


        //Close scanner
        scanner.close();

    }
}
