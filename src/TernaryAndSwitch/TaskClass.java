package TernaryAndSwitch;
import java.util.Scanner;

public class TaskClass {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("First number ");
      int number1 = input.nextInt();
        System.out.println("Second number ");
        int number2 = input.nextInt();

        System.out.println("What is the operator ");
        String operator = input.next();

        switch (operator) {

            case "multiply":
                System.out.println(number1 * number2);
                break;
            case "addition":
                System.out.println(number1 + number2);
                break;
            case "module":
                System.out.println(number1 % number2);
                break;
            case "division":
                System.out.println(number1 / number2);
                break;
            case "subtraction":
                System.out.println(number1 - number2);
                break;




        }
    }}

    //TASK:
//Using scanner ask user to input two int values and ask the name of the operator like multiple, divide, module, substract, addition
//if the operator name is matching then apply given operator to the these two number
//please enter first num:
//30
//Please enter second num:
//10
//what is operator name?
//Multiple
//OUTPUT
//300
//Example 2
//please enter first num:
//25
//Please enter second num:
//16
//what is operator name?
//addition
//OUTPUT
//41