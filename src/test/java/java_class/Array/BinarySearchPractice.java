package Array;
import java.util.Arrays;
public class BinarySearchPractice {

    public static void main(String[] args) {

        //We must sort the array before using the Binary search method
        // Arrays.binarySearch(nameOfTheArray, number);

        int [] numbers={4, 5, 6787, 3, 6 , 856};

       Arrays.sort(numbers);
       // {3,4,5,6,856,6787}

        int result = Arrays.binarySearch(numbers, 10);
        System.out.println(result);


    }
}
