package map;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTable {

    public static void main(String[] args) {

        Hashtable  <Integer, String> classNames = new Hashtable<>();

        classNames.put(201, "Computer");
        classNames.put(202, "Math");
        classNames.put(203, "Science");
        classNames.put(204, "Test");


        Set<Map.Entry<Integer, String>>  classes = classNames.entrySet();

        for(Map.Entry<Integer, String> class1 : classes) {
            System.out.println(class1.getValue());
            System.out.println(class1.getKey());
        }
    }
}
