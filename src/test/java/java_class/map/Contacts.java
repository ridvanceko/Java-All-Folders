package map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Contacts {

    public static void main(String[] args) {

        Map<String, String> contacts = new HashMap();

        contacts.put("Adam", "2222334567");
        contacts.put("Olivia", "333456678");
        contacts.put("David", "99954785643");
        contacts.put("Mark", "444334567");

        System.out.println(contacts.containsKey("Olivia"));
        System.out.println(contacts.containsValue("99954785643"));

        // keyset() method return keys from the map in SET format.
        printKeys(contacts);
        printValues(contacts);


//        Set<String> names = contacts.keySet();
//
//        for(String name : names) {
//            System.out.println(name);
 //      }


        Collection<String> phones = contacts.values();
        for(String phone : phones) {
            System.out.println(phone);


        }
    }

    // TASK-1: Create a method will take one map which has data type of String, String
    // and this method will print all the key from map.
    // TASK-2: Create a method will take one map which has data type of String, String
    // and this method will print all the values from map.

    public static void printKeys(Map <String, String> map) {

             Set<String>  keys =  map.keySet();

             for(String key : keys) {
                 System.out.println(key);
             }

    }

    public static void printValues(Map <String, String> map) {

        Set<String>  keys =  map.keySet();

        for(String key : keys) {
            System.out.println(map.get(key));
        }

    }

}
