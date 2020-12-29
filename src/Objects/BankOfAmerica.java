package Objects;

import java.util.Scanner;

public class BankOfAmerica {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Bank Of America");
        System.out.println("What is your name?");

        String name = input.next();
        System.out.println("Hi " + name + ", Please select one of the instructions.");


        BankAccount david = new BankAccount();
        david.getInstructions();
        int exit=-1;

        do{
            int option = input.nextInt();
            switch (option) {
                case 0:
                    System.out.println("Please enter your name: ");
                    String personName = input.next();
                    System.out.println("Please enter account number: ");
                    String accountNum = input.next();
                    System.out.println("Please enter the balance amount: ");
                    int balance = input.nextInt();
                    System.out.println("Please enter your user name: ");
                    String username=input.next();
                    System.out.println("Please enter your password: ");
                    String password = input.next();
                    david.signUp(personName, accountNum, balance, username, password);
                break;
                case 1:
                    System.out.println("Please enter user name: ");
                    String username1 = input.next();
                    System.out.println("Please enter password: ");
                    String password1 = input.next();
                    david.login(username1, password1);
                    break;

                case 2:
                    System.out.println("What is your deposit amount? ");
                    double depositAmount = input.nextDouble();
                    david.deposit(depositAmount);
                    break;

                case 3:
                    System.out.println("What is your withdraw amount? ");
                    double withdrawAmount = input.nextDouble();
                    david.withdraw(withdrawAmount);
                    break;

                    case 4:
                    david.display();
                    break;

                case 5:
                    david.getInstructions();
                    break;

                    case 6:
                    exit=6;
                    break;
            }
            System.out.println("Please select one of the instructions. To print instructions enter 5");
            //implement deposit, withdraw and print instructions functionality.

        }while(exit!=6);
        System.out.println("Thank you for using our Bank");

    }
}
