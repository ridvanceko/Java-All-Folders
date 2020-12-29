package WhileLoop;
import java.util.Scanner;

public class PrintStar {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String value");

        String star = "*";

        int num = 1;              //IMPORTANT Very Common interview question!!!!!!

        while(num<=5) {
            System.out.println(star);
            star=star.concat("*");
            num++;
        }


}}

/*
*
*       *
*       **
*       ***
*       ****
*       *****
*
* the loop will run 5 times will print the stars in given format.
 */