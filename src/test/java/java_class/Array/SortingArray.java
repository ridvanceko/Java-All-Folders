package Array;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {

        int [] numbers = {10, 6, 14, 8, 45, 34};
        int swap=0; // i assign this after i need to compare two loop

        for (int i=0; i<numbers.length; i++) {

            for (int k=i+1; k<numbers.length; k++) {

                if(numbers[i]>numbers[k]) {
                     swap = numbers[i]; //10
                    numbers[i]=numbers[k];
                    numbers[k]=swap;
                }
            }

        }
        System.out.println(Arrays.toString(numbers));

    }
}
