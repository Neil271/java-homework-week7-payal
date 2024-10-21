package javaprogramme;
/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 */

import java.util.Scanner;

public class EmployeeSalary {

    //Variable declaration
    int id, salary, pf, hra, ta, da, grossSalary;
    String name;

    //Main Method
    public static void main(String[] args) {
        //calling employee Method
        employee();
    }

    //Employee
    public static void employee() {
        //creating object
        EmployeeSalary employeeSalary = new EmployeeSalary();
        //creating scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Name");
        employeeSalary.name = scanner.nextLine();
        System.out.println("Enter Employee Id");
        employeeSalary.id = scanner.nextInt();
        System.out.println("Enter Employee Basic Salary");
        employeeSalary.salary = scanner.nextInt();

        //Find HRA, TA, DA, PF and Gross salary
        employeeSalary.hra = (employeeSalary.salary * 10) / 100;
        employeeSalary.da = (employeeSalary.salary * 8) / 100;
        employeeSalary.ta = (employeeSalary.salary * 9) / 100;
        employeeSalary.pf = (employeeSalary.salary * 20) / 100;
        employeeSalary.grossSalary = (employeeSalary.salary + employeeSalary.hra + employeeSalary.ta + employeeSalary.da) - employeeSalary.pf;

        //close scanner
        scanner.close();


        //Printing SalarySlip
        System.out.println("--------------------------------");
        System.out.println("|---------SalarySlip-----------|");
        System.out.println("|------------------------------|");
        System.out.println("| Employee Id       :  " + employeeSalary.id + "      |");
        System.out.println("| Employee Name     :  " + employeeSalary.name + "    |");
        System.out.println("|------------------------------|");
        System.out.println("| Basic Salary      :  " + employeeSalary.salary + "   |");
        System.out.println("| HRA 10%           :  " + employeeSalary.hra + "    |");
        System.out.println("| TA 8%             :  " + employeeSalary.ta + "    |");
        System.out.println("| DA 9%             :  " + employeeSalary.da + "    |");
        System.out.println("| PF 20%            :  " + employeeSalary.pf + "    |");
        System.out.println("|------------------------------|");
        System.out.println("| Gross Salary      :  " + employeeSalary.grossSalary + "   |");
        System.out.println("|==============================|");

    }
}
