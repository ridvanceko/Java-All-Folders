package map;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map;


public class TreeMapPractice {

    public static void main(String[] args) {


        // 60018 --> Des Plaines
        // 60606 --> Chicago

        TreeMap<Integer, String> cities = new TreeMap<>();
        cities.put(60018, "Des Plaines");
        cities.put(60606, "Chicago");
        cities.put(60659, "Chicago");
        cities.put(11229, "New York");
        cities.put(78613, "Austin");
        cities.put(19053, "PA");

       // entrySet(); --> Set<MAp.Entry<Integer, String>>
        // entrySet method return everything from map as a SET. Data type of set is Map.Entry
        /*
        Map.Entry interface has two methods which are getValue and getKey
         */

        Set<Map.Entry<Integer, String>> data = cities.entrySet();

        for(Map.Entry<Integer, String> city : data) {
            System.out.println(city.getKey());
            System.out.println(city.getValue());
        }


    }
}
