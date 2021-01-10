package map;
import java.util.*;

public class HashMapExample2 {
    public static void main(String[] args) {

        String[] arrayOfString = {"Banana", "Grapefruit", "Apple", "Strawberry", "Raspberry", "Blueberry",
                "Blackberry", "Apple", "Pear", "Banana", "Grapefruit", "Apple", "Pear", "Grapefruit"};

        HashMap<String, Integer> map = new HashMap();

        for (int i = 0; i <arrayOfString.length ; i++) {
          //  map.put(arrayOfString[i], 0);
            // set.add(fruit)
            // map.put(Key, 0);
            if(!map.containsKey(arrayOfString[i]))
                map.put(arrayOfString[i], 1);
            else{
                Integer currentAmount = map.get(arrayOfString[i]);
                map.put(arrayOfString[i], currentAmount + 1);
            }

        }

        // i => 7
        // arrayOfString[i] ==> Apple
        // map.containsKey(arrayOFString[i]) => false ->true
        //             map.put("Banana", 1)
        //currentAmount -1
        // map.put(arrayOfString[i], currentAmount + 1)  -> map.put("Apple", 2) -> it will update by 1

            System.out.println(map);

        }
    }


