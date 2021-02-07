package Array;
import java.util.Arrays;

public class ArrayFirstPractice {
    public static void main(String[] args) {

        //we must give the size for the Array
        int [] ages = new int [5];

        //{0, 0, 0, 0, 0}
        System.out.println(ages[0]);
        System.out.println(ages[4]);

        //{18, 22, 45, 54, 33}
        ages[0]=18;
        ages[1]=22;
        ages[2]=45;
        ages[4]=33;
        ages[3]=54;
       // ages[9]=99; --> Error --> outOfBoundException
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);

        System.out.println("Length of the array is: " + ages.length);
        System.out.println("Using loop print all the elements from array");

        for(int i=0; i<ages.length; i++){
            System.out.println(ages[i]);
        }
        System.out.println(Arrays.toString(ages));

    }

}
