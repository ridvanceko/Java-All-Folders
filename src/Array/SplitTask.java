package Array;
import java.util.Arrays;
public class SplitTask {
    public static void main(String[] args) {

       String  str ="The method split() splits a String into multiple Strings given the delimiter that separates them. The returned object is an array which contains the split Strings. We can also pass a limit to the number of elements in the returned arrayThe method split() splits a String into multiple Strings given the delimiter that separates them. The returned object is an array which contains the split Strings. We can also pass a limit to the number of elements in the returned array";
               //TASK: Print all the words which has a length of odd numbers

       String [] words = str.split(" ");

        for (int i = 0; i <words.length; i++) {
            if(words[i].length()%2!=0) {
                System.out.println(words[i]);
            }

        }





    }
}
