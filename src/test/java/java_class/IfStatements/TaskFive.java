package IfStatements;
import java.util.Scanner;

public class TaskFive {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Is this number ? ");

        int number = input.nextInt();


        if (number >10 ) {
            System.out.println("This number is bigger than 10 ");
        }else if (number >8 ){
            System.out.println("This number is bigger than 8 ");
        }else if (number > 4) {
            System.out.println("This number is bigger than 4 ");
        } else {
            System.out.println("This number is less than 4 ");
        }

    }
}
