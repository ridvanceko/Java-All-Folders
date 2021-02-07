package ForLoop;
import java.util.Scanner;
public class FirstPractice {
    public static void main(String[] args) {

//print the numbers between 22 to 28 using for loop

        for (int num=22; num<=58; num++) {

            if(num%5==0) {
                System.out.println(num);
            }
        }



    }
}


//difference between do, while, and for loop

//do while --> will run at least once even condition is false (it will run the body at least once)
// while --> initialize value before while
//for loop --> initializing inside curly