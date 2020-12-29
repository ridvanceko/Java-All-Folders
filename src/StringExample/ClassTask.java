package StringExample;
import java.util.Scanner;

public class ClassTask {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Please provide your personal information " +
                "\n Gender - yourFullName - Date of birth (mm/dd/yyyy): ");

        String info = input.nextLine();
        System.out.println(info);

        System.out.println(info.startsWith("F"));
        System.out.println(info.startsWith("M"));
        System.out.println(info.contains("Ridvan"));
        System.out.println(info.endsWith("1991"));




    }
}
