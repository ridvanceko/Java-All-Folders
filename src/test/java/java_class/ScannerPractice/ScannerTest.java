package ScannerPractice;



import java.util.Scanner; // we have to import Scanner before always before class

public class ScannerTest {

    public static void main (String[] args){



        Scanner input = new Scanner(System.in);
        System.out.println("What is your height?");

        double height = input.nextDouble();

        System.out.println("What is your weight ");
        int weight = input.nextInt();

        System.out.println("The height is " + height);
        System.out.println("The weight is " + weight);


    }
}
