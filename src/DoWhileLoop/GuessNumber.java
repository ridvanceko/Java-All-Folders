package DoWhileLoop;
import java.util.Random;
import java.util.Scanner;
public class GuessNumber {

    public static void main(String [] args) {

        //Random class --> it will create random numbers


        Random random = new Random();
        int randomNumber = random.nextInt(101); //you can only provide from 0

        Scanner input = new Scanner(System.in);
        int number;

        int count=0;

        //55 --> 100

        do {
            System.out.println("Please guess a number between 0-100 ");
            number = input.nextInt();

            if (number < randomNumber) {
                System.out.println("The number is less than random number");
            } else if(number>randomNumber) {
                System.out.println("The number is bigger than random number");
            }

            count++;
        }while (number!=randomNumber && count<5);
        System.out.println("The random number is " + randomNumber);
        System.out.println(count);

    }}

