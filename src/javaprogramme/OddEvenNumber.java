package javaprogramme;
/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class OddEvenNumber {

    public static void main(String[] args) {
        evenOdd();// method calling
    }

    public static void evenOdd() {
        // scanner created to take input from user
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = reader.nextInt();

        // Use ternary operator to find number is even or odd
        String oddEven = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + oddEven + " number.");
        reader.close();// scanner close
    }

}
