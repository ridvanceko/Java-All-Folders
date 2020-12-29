package IfStatements;

import java.util.Scanner;

public class TaskSix {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many table? ");


       int table = input.nextInt();
      double totalPrice = table*110;


        if(table > 20) {
        double discountAmount = totalPrice*0.18;
            System.out.println("Discount: $" + discountAmount);
            totalPrice -= discountAmount;
            System.out.println("Total Price:$ " + totalPrice);
        } else if(table >=16 && table <=20) {
            double discountAmount = totalPrice*0.15;
            System.out.println("Discount: $" + discountAmount);
            totalPrice -= discountAmount;
            System.out.println("Total Price:$ " + totalPrice);


        } else if(table >=10) {
            double discountAmount = totalPrice * 0.10;
            System.out.println("Discount: $" + discountAmount);
            totalPrice -= discountAmount;
            System.out.println("Total Price:$ " + totalPrice);
        }else {
            System.out.println("There is no discount");
            System.out.println("Total Price:$ " + totalPrice);
        }

    }
}
