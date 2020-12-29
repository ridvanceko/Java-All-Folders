package IfStatements;
import java.util.Scanner;

public class NestedIf {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you know Java? ");

        String java = input.next();

        if (java.equals("yes")) {
            System.out.println("Do you know Selenium? ");
            String selenium = input.next();
            if(selenium.equals("yes")) {
                System.out.println("Do you know API? ");
                String api = input.next();
                if(api.equals("yes")) {
                    System.out.println("Do you know SQL");
                } else
                    System.out.println("We require API ");
                String sql = input.next();
                if(sql.equals("yes")) {
                    System.out.println("You are hired");
                }else {
                    System.out.println("we require SQL");
                }
            }else {
                System.out.println("We require Selenium ");
            }

        } else {
            System.out.println("We require Java ");
        }


}}
