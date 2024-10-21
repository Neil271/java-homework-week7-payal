package javaprogramme;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */

public class PrintOneToHundred {

    //Main Method
    public static void main(String[] args) {

        //calling method
        printNumberByThree();
        printNumberByFive();

    }

    //Print Method
    public static void printNumberByThree() {
        System.out.println("List of number divided by 3.");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }

        //System.out.println("--------------------------------------");
    }

    public static void printNumberByFive() {
        System.out.println("List of number divided by 5.");
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ,");
            }
        }
    }
}
