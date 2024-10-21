package javaprogramme;

import java.util.Scanner;

/**
 * 20. Write a Java program to test if an array contains a specific value.
 */
public class ArrayContainsValue {
    public static void main(String[] args) {
        valueOfArray();//method calling
    }

    public static void valueOfArray() {
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

        // Prompt user for the value to search for
        System.out.print("Enter the value to search for: ");
        int searchValue = scanner.nextInt();

        // Check if the array contains the specific value
        boolean found = false;
        for (int num : array) {
            if (num == searchValue) {
                found = true;
                break;
            }
        }

        // Output the result
        if (found) {
            System.out.println("The array contains the value: " + searchValue);
        } else {
            System.out.println("The array does not contain the value: " + searchValue);
        }

        scanner.close();// scanner close
    }
}

