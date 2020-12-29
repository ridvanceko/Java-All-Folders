



package TasksInClass;

import java.util.Scanner;

public class BankDavid {
    public static void main (String [] args) {

        //Everytime once you see the name which starts with upper case it means it is "class" in java.
        Scanner input = new Scanner(System.in);
        //creates a new Scanner instance which points to the input stream passed as argument.

        double deposit =0;

//        double deposit1 = 500;
//        double deposit2 = 400;
//        double deposit3 = 300;


        System.out.println("How much you want to add " );
        deposit += input.nextDouble();


        System.out.println("How much you want to add " );
        deposit += input.nextDouble();

        System.out.println("How much you want to add " );
        deposit += input.nextDouble();


        System.out.println("How much you spend for Computer? " );
        deposit -= input.nextDouble();
        System.out.println("How much you spend for Phone? " );
        deposit -= input.nextDouble();

        System.out.println("Your balance is " + deposit);




//        String add1 = input.next();
//
//        System.out.println("How much you want to add ");
//        String add2 = input.next();
//
//        System.out.println("How much you want to add ");
//        String add3 = input.next();
//
//
//        System.out.println("How much spend for Computer ");
//        String computer = input.next();
//
//        System.out.println("How much spend for Phone ");
//        String  phone = input.next();








    }

}
