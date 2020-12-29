package Array;
import java.util.Arrays;
public class TaskArray {

    public static void main(String[] args) {
//find the missing number
        int [] numbers = {1, 2, 3, 4, 5, 7, 8, 9};

        int sum = 0;

        for (int i=0; i<numbers.length; i++) {
              sum+=numbers[i];

//             if(numbers[i]!=i+1) {
//                 System.out.println(i+1);      //-->best way to find the missing number.
//                 break;
//
//            }

            int expectedSum = 9*10/2;
            System.out.println(expectedSum-sum);   //this method will ONLY work for 1 missing number


        }





    }
}
