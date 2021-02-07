package WhileLoop;
import java.util.Scanner;

public class TaskPrintLetter {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String value");

        String name = input.nextLine();

        int index = 0;

        //while index is less than last index number run the while loop
        //and use this index number to print the letters inside the loop
        while(index < name.length()) {
            System.out.println(name.charAt(index));
            index++;
        }

        //techtorial -- > lairothcet
        System.out.println("Last char to first char ");

        int indexNum = name.length()-1; //9
                                              //IMPORTANT : Very common interview question!!!!!
        while (indexNum>=0){

            System.out.println(name.charAt(indexNum));
            indexNum--;
        }



}}

//TASK
//Print all the letter given String using while loop
//String str="Techtorial";

//str.charAt(0);
//str.charAt(1);
//str.charAt(2);
//str.charAt(3);
//str.charAt(4);
//.
//.
//.
//str.charAt(str.length-1);