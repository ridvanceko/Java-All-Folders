package Array;
import java.util.Arrays;
public class LargestNumber {
    public static void main(String[] args) {

        int [] number ={6, 45, 367,23, 97};

        int biggestNum = number [0];

        for(int i=1; i<number.length; i++){
            if(number[i]>biggestNum){
                biggestNum = number[i];
            }
        }
        System.out.println(biggestNum);

    }
}
