package map;
import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> map = new LinkedHashMap();
        HashMap<String, Integer> map1 = new HashMap();
        TreeMap<String, Integer> map2 = new TreeMap();

        map.put("Banana", 1);  map1.put("Banana", 1);  map2.put("Banana", 1);
        map.put("Apple", 4);  map1.put("Apple", 1);  map2.put("Apple", 1);
        map.put("Orange", 5); map1.put("Orange", 1); map2.put("Orange", 1);
        map.put("Kiwi", 10);    map1.put("Kiwi", 1); map2.put("Kiwi", 1);
        map.put("Grapefruit", 11); map1.put("Grapefruit", 1); map2.put("Grapefruit", 1);
        map.put("Tangerine", 12);  map1.put("Tangerine", 1); map2.put("Tangerine", 1);

        map.put("Cherry", null);      map1.put("Cherry", null);      map2.put("Cherry", null);
        map.put("Pineapple", null);       map1.put("Pineapple", null);       map2.put("Pineapple", null);

        //how many null keys can HasMap and LinkedHashMAp can hold?
        // what is the type of each Map? What collection type Map uses far its keys?
        //    HashMap -> HashSet
        //    LinkedHashMap -> LinkedHashSet
        //   TreeMap -> TreeSet
        // Sets can hold only unique elements, null value will only be once
        // Map can only one null key

        System.out.println(map);
        System.out.println(map1);
        System.out.println(map2);



    }

}
