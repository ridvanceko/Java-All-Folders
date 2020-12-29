package DoWhileLoop;
import java.util.Random;
import java.util.Scanner;
public class HeadsAndTails {

    public static void main(String[] args) {


        Random random = new Random();
        String answer;
        int count=0;

        do {
            int number = random.nextInt(2);
            Scanner input = new Scanner(System.in);

            String flippedCoin = number == 0 ? "Heads" : "Tails";
            System.out.println("Coin is flipping...");
            System.out.println("Please enter your guess...");
            String userGuess = input.next();

            if (userGuess.equalsIgnoreCase(flippedCoin)) {
                System.out.println("Your guess is correct ");

            } else {
                System.out.println("Sorry you lost. It is " + flippedCoin);
            }

            System.out.println("Do you want to play again? ");
            answer=input.next();
            count++;

        }while(answer.equalsIgnoreCase("yes") && count<3);

        System.out.println("Thank for playing! ");


        }
    }
