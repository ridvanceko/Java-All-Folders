package Array;
import java.util.Arrays;
public class MissingNumber2 {

    public static void main(String[] args) {

        int [] numbers = {7, 3, 6, 5, 1 };
        //from given array print all missing numbers 1 to 9

        Arrays.sort(numbers);
        //expected values 1, 2, 3, 4, 5 ,6 ,7 ,8, 9

        for (int i = 1; i<=9 ; i++) {
            boolean missing = true;

            for (int k = 0; k < numbers.length; k++) {
                if(i == numbers[k]) {
                    missing = false;

            }
        }

            if(missing == true) {
                System.out.println(i);
            }


        }
    }
}
