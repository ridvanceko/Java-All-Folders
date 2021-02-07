package ForLoop;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 10 ");
        int number = input.nextInt();

        System.out.println("num - 1");
        int firstNumber = input.nextInt();
        int biggestNumber = firstNumber;

        for (int i=2; i<number; i++){              //because of the counting we can start with 2

            System.out.println("number - " + i );
            int secondNumber = input.nextInt();

            if(secondNumber>biggestNumber) {
                biggestNumber=secondNumber;
            }
        }
        System.out.println(biggestNumber);

    }
}

//Using scanner ask user one number 1 to 10
//5
//num1
//num2
//...