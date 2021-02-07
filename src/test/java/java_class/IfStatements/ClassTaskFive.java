package IfStatements;
import java.util.Scanner;

public class ClassTaskFive {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = input.nextInt();
        System.out.println("Enter a number");

        int num2 = input.nextInt();
        System.out.println("Enter a number");
        int num3 = input.nextInt();

     // int biggestNum = input.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.println("this is biggest number " +num1);
        }else if(num2>num3) {
            System.out.println("this is biggest number " +num2);
        }else {
            System.out.println("this is biggest number" + num3);
        }
    }
}
