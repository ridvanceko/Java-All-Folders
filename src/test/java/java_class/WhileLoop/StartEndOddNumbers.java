package WhileLoop;
import java.util.Scanner;

public class StartEndOddNumbers {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
       System.out.println("Starting number: ");
        int start = input.nextInt();
        System.out.println("Ending Number");
        int ending = input.nextInt();

        int sum = 0;

        //int odd = sum%2;

        //if you multiply default value has to be 1 "int multiply = 1;"


        while(start<=ending) {
            if(start%2==1)
           sum+=start;
            System.out.println(sum);
            {
                start++;
            }

        }

        System.out.println("Sum of the numbers: " + sum);

    }
}





////TASK:
////Using scanner ask user starting number and ending number
////Print sum of numbers between starting and ending number
////Starting number
////5
////Ending
////8
////5+6+7+8
////Print Sum
////sum= 26
//Sum just the ODD numbers