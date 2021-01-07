package ArrayListPractice;
import java.util.*;

public class ArrayListPractice1 {
    public static void main(String[] args) {

        ArrayList <Integer>list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
      //  list.add("Some Text");

        for(Integer item: list) {
            list.add(list.get(0) );
        }

        System.out.println(list);


    }
}
