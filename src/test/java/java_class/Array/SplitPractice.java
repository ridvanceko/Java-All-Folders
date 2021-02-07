package Array;
import java.util.Arrays;
public class SplitPractice {

    public static void main(String[] args) {

        String str = "Split method is coming from the String Class.";

        String [] words = str.split(" ");
        //String method will split the string with spaces and stor inside the array

        System.out.println(Arrays.toString(words));
        System.out.println(words.length);


        String cities= " Chicago.Denver.Austin.Houston.Portland";

        String [] city = cities.split("\\.");
        //when we try to split with "." we must use the '\\' in the beginning
         System.out.println(Arrays.toString(city));
    }
}
