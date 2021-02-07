package Array;
import java.util.Arrays;
public class TaskClass1 {

    public static void main(String[] args) {

        char [] arrayList ={'a', 'r', '4', '2', 'w', '8'};

        for(int i=0; i < arrayList.length; i++) {
            if (arrayList[i] >=45 && arrayList[i]<=57 ){
                System.out.println(arrayList[i]);
            }
        }

    }

}

//String [] cars={"Toyota", ...}

//Create the char array with given values a, r, 4, 2, w, 8
//print only the numbers from given array