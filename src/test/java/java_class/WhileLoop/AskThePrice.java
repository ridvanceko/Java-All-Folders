package WhileLoop;

import java.util.Scanner;
public class AskThePrice {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("The phone price is $500. Please enter the amount: ");
        double userInput = input.nextDouble();

        while(userInput < 500) {
            double requireAmount = 500-userInput;
            System.out.println("Please input: " + requireAmount );
            userInput+=input.nextDouble(); //ask Umut variable++ and variable+
        }
              double exchange = userInput-500;
        System.out.println("The phone is yours.... The exchange amount is  " + exchange);


}}

//Phone = 500
//100
//Please enter 400 more
//100
//Please enter 300 more
//300
//You can get the phone