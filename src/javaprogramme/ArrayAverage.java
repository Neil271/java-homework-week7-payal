package javaprogramme;

import java.util.Scanner;

/**
 * 19. Write a Java program to calculate the average value of array elements.
 */
public class ArrayAverage {
    public static void main(String[] args) {
        averageOfArray();
    }

    public static void averageOfArray() {
        // scanner created
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        double[] array = new double[size]; // Use double for average calculation

        // Input values into the array
        System.out.println("Enter " + size + " numeric values:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        // Calculate the sum of the array
        double sum = 0;
        for (double num : array) {
            sum += num;
        }

        // Calculate the average
        double average = sum / size;

        // Output the average
        System.out.println("The average of the array values is: " + average);

        scanner.close();//scanner close
    }
}