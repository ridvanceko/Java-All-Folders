package DoWhileLoop;
import java.util.Scanner;
public class TaskClassSum {

    //While the number is bigger than 0 remainder with 10 than print it than divide 10
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a digit number");
        int number = input.nextInt();
        int sum=0;
        int multiply=1;
                                          //IMPORTANT Possible INTERVIEW question
       while (number>0) {
           int digit = number%10;
           sum+=digit;
           multiply*=digit;

           System.out.println(digit);
           number = number/10;

       }
        System.out.println("Sum of the digit " + sum); // Sum must be outside of the while
        System.out.println("Multiply of the digits " + multiply);
    }}

//Print all the digits from given number
//345436
//675
