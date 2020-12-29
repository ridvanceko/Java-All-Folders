package DoWhileLoop;
import java.util.Random;
import java.util.Scanner;
public class DiceGame {
    public static void main(String[] args) {

        //12, 6
        //we will roll the dices until sum of the dice is equals to user input
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 2-12 ");
        int number = input.nextInt();

        //while the sum of the dices are not equals to given  number than keep continue to roll dices

        int sum;
        int count=0;
        int balance=100;

do {
    int dice1 = random.nextInt(6); //0-5
    int dice2 = random.nextInt(6); //0-5
     sum = ++dice1 + ++dice2;
    System.out.println("Dice One is " + dice1 + " Dice Two is " + dice2);
    count++;

    if(count<=5 && sum==number) {
        balance+=200;
        System.out.println("You earned $200 " );
    }else{
        balance-=10;
        System.out.println("Table gets $10 ");
    }

}while(sum!=number && count<5);
        System.out.println("Balance is " + balance);
        System.out.println("You have rolled the dice " + count + " times to find the " + number);


//    System.out.println("Dices are rolling...");
//    System.out.println("Please enter your guess...");
//    int userGuess = input.nextInt();

//
//    if (userGuess == sum) {
//        System.out.println("Your guess is correct ");
//
//    } else {
//        System.out.println("Sorry you lost. It is " + sum);
//    }
//
//    System.out.println("Do you want to play again? ");
//
//    number = input.nextInt();
//    count++;




}
}
