package IfStatements;
import java.util.Scanner;

public class ClassTaskThree {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Is is morning or afternoon");
        String number = input.nextLine();

        if(number.endsWith("am")) {
            System.out.println("Good morning ");

        } if (number.startsWith("pm")){
            System.out.println("Good Afternoon");
        }

    }}
