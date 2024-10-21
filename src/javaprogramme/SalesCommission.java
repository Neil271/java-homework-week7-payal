package javaprogramme;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class SalesCommission {

    // Variable declaration
    int salesId, salesAmount, salaryBasic, commission;
    String sellersName;

    public static void main(String[] args) {
        sale();// method calling
    }

    public static void sale() {
        // create object to call instance variable
        SalesCommission obj = new SalesCommission();
        // scanner create
        Scanner amount = new Scanner(System.in);
        System.out.println("Enter Sales Id :");
        obj.salesId = amount.nextInt();
        System.out.println("Enter Seller's Name :");
        obj.sellersName = amount.next();
        System.out.println("Enter Sales Amount :");
        obj.salesAmount = amount.nextInt();
        System.out.println("Enter Salary Basic :");
        obj.salaryBasic = amount.nextInt();

        // find commission using if else statement
        if (obj.salesAmount >= 50000) {
            obj.commission = (obj.salesAmount * 35) / 100;
        } else if (obj.salesAmount >= 30000) {
            obj.commission = (obj.salesAmount * 20) / 100;
        } else if (obj.salesAmount >= 20000) {
            obj.commission = (obj.salesAmount * 10) / 100;
        } else if (obj.salesAmount >= 10000) {
            obj.commission = (obj.salesAmount * 5) / 100;
        } else {
            obj.commission = (obj.salesAmount * 2) / 100;
        }
        System.out.println("Commission : " + obj.commission);
        amount.close();// scanner close
    }
}
