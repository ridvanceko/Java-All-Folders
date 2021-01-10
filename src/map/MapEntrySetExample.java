package map;
import java.util.*;

public class MapEntrySetExample {

    public static void main(String[] args) {
        //{Banana, 1}, {Orange, 2}, {Kiwi, 5}, {Pear, 0} --> entries
        HashMap<String, Integer> fruits = new HashMap();
        //how can you iterate the Set or List?
        // for(String item: set) {....} - iterating Set
        // for(String item: list) {.....} - iterating a List
        // how can you iterate the map?

        fruits.put("Banana", 1);
        fruits.put("Orange", 2);
        fruits.put("Kiwi", 5);
        fruits.put("Pear", 0);

        // Approach -1 Use .keySet()
        Set<String> keys = fruits.keySet();   // Set - super class for HashSet, LinkedHashSet, TreeSet
        for(String key: keys) {
            System.out.println(key + " - " + fruits.get(key));
        }
        System.out.println("..................");

        //Approach -2 Use .entrySet()

        Set < Map.Entry<String, Integer> > entries = fruits.entrySet();
        for(Map.Entry entry: entries) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


    }
}
