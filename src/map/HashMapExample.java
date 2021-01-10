package map;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap();

        map.put("Serhan", "312 111 2222");
        map.put("Mehmet", "312 222 5555");
        map.put("Kushal", "312 777 2222");
        map.put("Pryanka", "312 576 2222");
        map.put("Sandeep", "312 908 2222");
        map.put("Serhan", "888 123 12312");
        map.put(null, "000 000 0000");
        map.put("Michael", null);
        map.put(null, "111 111 1111");
        System.out.println(map);
        map.remove("Sandeep");
        System.out.println(map);
        System.out.println(map.get("Sandeep"));
        Set<String> keySet = map.keySet();
        System.out.println(keySet);
        map.replace("Kushal", "312 777 0000");
        System.out.println(map);
        map.containsKey("Sundeep");
        map.containsValue("000 000 0000");
        System.out.println(map.put("Raj", "11 11 11"));
        System.out.println(map.put("Raj", "00 11 11"));
        // set.add("") -> false then it means value already existed in set
        // map.put(obj, obj) -> origin value, if the key already exist and replace the value
        // Solve the problem of finding unique elements inside of Array
        // but using the Map
        String[] arrayOfString = {"Banana", "Grapefruit", "Apple", "Strawberry", "Raspberry", "Blueberry", "Blackberry", "Apple", "Pear", "Banana", "Grapefruit", "Apple", "Pear", "Grapefruit"};
        // map.put
        // 2. Count the items inside of the Fruits array and give the number of each
        // Banana - 2, Apple - 3
    }


}
