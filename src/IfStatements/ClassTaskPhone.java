package IfStatements;
import java.util.Scanner;

public class ClassTaskPhone {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Phone Brand between Apple, Samsung or Google ");
        String phone = input.nextLine();

        if (phone.equals("Apple")) {
            System.out.println("which model do you want between iphone10, iphone11, iphone12 ");
            String iphone10= input.next();
            if(iphone10.equals("iphone10")) {
                System.out.println("$800");
                String iphone11 = input.next();
                if(iphone11.equals("iphone11")) {
                    System.out.println("$900");
                    String iphone12 = input.next();
                } if(iphone11.equals("iphone12")) {
                    System.out.println("$1000");}

                else {
                System.out.println("");
            }



    }}}
}
