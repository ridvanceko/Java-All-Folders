package DoWhileLoop;
import java.util.Scanner;
public class TaskClassDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a digit number");
        int number = input.nextInt();
        int sum=0;

        while (number>0) {
            int digit = number%10;
            if(digit>5) {
                sum+=digit;
            }

            System.out.println(digit);
            number = number/10;

        }
        System.out.println("Sum of digit numbers which is bigger than 5 is " + sum);

}}

//From given int value find the sum of digits which is bigger than 5