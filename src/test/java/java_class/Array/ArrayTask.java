package Array;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the number of name? ");
        int number = input.nextInt();

        String [] names = new String[number];
        //store the names if the name size is bigger than 5

        int index = 0;
        for(int i=0; i<number; i++){
            System.out.println("Please enter a name: ");
            String name = input.next();
            if (name.length() > 3) {

                names[index++] = name;
            }

        }
        System.out.println(Arrays.toString(names));

    }
}
