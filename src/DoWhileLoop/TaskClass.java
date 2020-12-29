package DoWhileLoop;
import java.util.Scanner;
public class TaskClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String Value");
        String str = input.next();
        //System.out.println("Enter a String value");


//        String x = "x";
//
//
//        int number = 1;

        while(str.length()<20) {
           str = str.concat("X");
            System.out.println(str);
        }
    }
}