package javaprogramme;
/**
 * Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class OddEvenWithIfElse {
    public static void main(String[] args) {
        oddEven();//method calling
    }

    public static void oddEven() {
        // scanner create
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = reader.nextInt();

        // if else condition to find number is odd or even
        if (num % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
        reader.close();// scanner close
    }
}
