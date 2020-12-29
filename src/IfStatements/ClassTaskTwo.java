package IfStatements;
import java.util.Scanner;

public class ClassTaskTwo {
   public static void main (String [] args) {

       Scanner input = new Scanner(System.in);

       System.out.println("Enter a number between 6-18");
       int number = input.nextInt();

       if(number >=6 && number<=11 ) {
           System.out.println("Good morning ");

       } if (number >=12 && number <= 18) {
           System.out.println("Good Afternoon");
       }

   }
}
