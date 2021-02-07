package WhileLoop;
import java.util.Scanner;

public class StartEndNumber {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Starting number: ");
        int start = input.nextInt();
        System.out.println("Ending Number");
        int ending = input.nextInt();

        int sum = 0;

        //if you multiply default value has to be 1 "int multiply = 1;"

        while(start<=ending) {
           sum+=start;
            start++;
        }

        System.out.println("Sum of the numbers: " + sum);

    }
}


//TASK:
//Using scanner ask user starting number and ending number
//Print sum of numbers between starting and ending number
//Starting number
//5
//Ending
//8
//5+6+7+8
//Print Sum
//sum= 26