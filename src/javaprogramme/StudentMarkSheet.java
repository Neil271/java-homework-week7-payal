package javaprogramme;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */

import java.util.Scanner;

public class StudentMarkSheet {

    //Instance Variable
    int rollNo, mathMark, scienceMark, englishMark, totalMark, percentage;
    String name, result, grade;

    //Main Method
    public static void main(String[] args) {
        student();
    }


    //Instance Method
    public static void student() {
        //creating class object
        StudentMarkSheet studentMarkSheet = new StudentMarkSheet();
        //Create Scanner
        Scanner scanner = new Scanner(System.in);

        //take input from user
        System.out.println("Enter student Name: ");
        studentMarkSheet.name = scanner.nextLine();
        System.out.println("Enter Student Roll No.: ");
        studentMarkSheet.rollNo = scanner.nextInt();
        System.out.println("Enter Math Marks: ");
        studentMarkSheet.mathMark = scanner.nextInt();
        System.out.println("Enter Science Marks: ");
        studentMarkSheet.scienceMark = scanner.nextInt();
        System.out.println("Enter English Marks: ");
        studentMarkSheet.englishMark = scanner.nextInt();

        //check marks should be between 0 to 100.
        if (studentMarkSheet.englishMark >= 0 && studentMarkSheet.englishMark <= 100 && studentMarkSheet.mathMark >= 0 && studentMarkSheet.mathMark <= 100 && studentMarkSheet.scienceMark >= 0 && studentMarkSheet.scienceMark <= 100) {
            studentMarkSheet.totalMark = studentMarkSheet.mathMark + studentMarkSheet.scienceMark + studentMarkSheet.englishMark;

            //find percentage
            studentMarkSheet.percentage = (studentMarkSheet.totalMark * 100) / 300;

            //Check student is pass or not
            if (studentMarkSheet.percentage >= 35) {
                studentMarkSheet.result = "Pass";
                //Find the grade
                if (studentMarkSheet.percentage >= 80) {
                    studentMarkSheet.grade = "A+";
                } else if (studentMarkSheet.percentage >= 60) {
                    studentMarkSheet.grade = "A";
                } else if (studentMarkSheet.percentage >= 50) {
                    studentMarkSheet.grade = "B";
                } else if (studentMarkSheet.percentage >= 35) {
                    studentMarkSheet.grade = "C";
                }
            } else {
                studentMarkSheet.result = "Fail";
                studentMarkSheet.grade = "Fail";
            }


        } else {
            System.out.println("please enter marks between 0 to 100.");
        }


        System.out.println(studentMarkSheet.name);
        //Scanned Closed
        scanner.close();


        //Print result
        System.out.println("-------------------------------");
        System.out.println("|         Mark Sheet          |");
        System.out.println("|-----------------------------|");
        System.out.println("|   Name        :   " + studentMarkSheet.name + "      |");
        System.out.println("|   Roll No     :   " + studentMarkSheet.rollNo + "        |");
        System.out.println("|-----------------------------|");
        System.out.println("|   Subject         Marks     |");
        System.out.println("|-----------------------------|");
        System.out.println("|   Math        :   " + studentMarkSheet.mathMark + "        |");
        System.out.println("|   Science     :   " + studentMarkSheet.scienceMark + "        |");
        System.out.println("|   English     :   " + studentMarkSheet.englishMark + "        |");
        System.out.println("|-----------------------------|");
        System.out.println("|   Total       :   " + studentMarkSheet.totalMark + "       |");
        System.out.println("|-----------------------------|");
        System.out.println("|   Percentage  :   " + studentMarkSheet.percentage + "        |");
        System.out.println("|   Result      :   " + studentMarkSheet.result + "      |");
        System.out.println("|   Grade       :   " + studentMarkSheet.grade + "        |");

        System.out.println("-------------------------------");

    }
}
