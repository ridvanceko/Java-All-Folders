package TernaryAndSwitch;
import java.util.Scanner;

public class NameValidation {

    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your id");
        int studentId = input.nextInt();

        //123, 124, 125
        switch (studentId) {

            case 123:
                System.out.println("Please enter student name: ");
                String name = input.next();
                if(name.equalsIgnoreCase("kushal"))
{
                    System.out.println("Denver");

                }else{
                    System.out.println("Wrong name");
                }break;

            case 124:
                System.out.println("Please enter student name: ");
                String name1 = input.next();
                if(name1.equalsIgnoreCase("priyanka")) {

                    System.out.println("chicago");

                }else{
                    System.out.println("Wrong name");
                }break;



            case 125:
                System.out.println("Please enter student name: ");
                String name2 = input.next();
                if(name2.equalsIgnoreCase("micheal")) {

                    System.out.println("houston");

                }else{
                    System.out.println("Wrong name");
                }break;



        }

    }}



//I have 3 students in class with the id 123, 124, 125
                // 123--> Kushal city name is Chicago
                // 124--> Priyanka city name is Denver
                // 125--> Micheal city name is Houston

                // ask the id of student and print students information
                // then ask the student name if student name is correct print city name of student

