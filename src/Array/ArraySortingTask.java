package Array;
import java.util.Arrays;
public class ArraySortingTask {
    public static void main(String[] args) {

        int [] nums = {4,5,6,7,7,8,1,1,4,6,5};



        for (int i = 0; i <nums.length ; i++) {

            int count = 1;

            for (int j = i+1; j <nums.length; j++) {

                if(nums[i]==nums[j]) {
                    count++;
                    if(nums[i]==nums[i+1]){
                        i++;
                    }
                }

            }
            if(count==1) {
                System.out.println(nums[i]);
                break;

            }

        }


}}

//every number repeated twice but only one digit is not repeated find that number from array and print it.
//{4,5,6,7,1,1,4,6,5}