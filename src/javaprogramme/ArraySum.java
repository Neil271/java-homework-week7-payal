package javaprogramme;

import java.util.Scanner;

/**
 * 18. Write a Java program to sum values of an array.
 */
public class ArraySum {

    public static void main(String[] args) {
        sumOfArray();//method created
    }

    public static void sumOfArray() {
        //scanner created
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Input values into the array
        System.out.println("Enter " + size + " numeric values:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate the sum of the array
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        // Output the sum
        System.out.println("The sum of the array values is: " + sum);

        scanner.close();// scanner close
    }
}
