package javaprogramme;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */
public class ArraySorter {
    public static void main(String[] args) {

        sortArray();// method calling
    }

    public static void sortArray() {
        //scanner created
        Scanner scanner = new Scanner(System.in);

        // Sorting a Numeric Array
        System.out.print("Enter the size of the numeric array: ");
        int numericSize = scanner.nextInt();
        int[] numericArray = new int[numericSize];

        System.out.println("Enter " + numericSize + " numeric values:");
        for (int i = 0; i < numericSize; i++) {
            numericArray[i] = scanner.nextInt();
        }

        // Sort the numeric array
        Arrays.sort(numericArray);
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numericArray));

        // Sorting a String Array
        System.out.print("Enter the size of the string array: ");
        int stringSize = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left from nextInt()
        String[] stringArray = new String[stringSize];

        System.out.println("Enter " + stringSize + " string values:");
        for (int i = 0; i < stringSize; i++) {
            stringArray[i] = scanner.nextLine();
        }

        // Sort the string array
        Arrays.sort(stringArray);
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));

        scanner.close();// scanner close
    }
}
