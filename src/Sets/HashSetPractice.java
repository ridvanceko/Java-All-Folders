package Sets;

//import java.util.ArrayList;
//import java.util.HashSet;
import java.util.*;

public class HashSetPractice {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        HashSet set = new HashSet(); //we are creating a new HashSet with Objects
        HashSet<String> setOfStrings = new HashSet<>(); //with Strings

        Set set2 = new HashSet(); //converting the ArrayList to HashSet of Objects

        setOfStrings.add("Banana");
        setOfStrings.add("Pear");
        setOfStrings.add("Strawberry");

        System.out.println(setOfStrings); //Sets (specifically HashSet, there are exception)  don't hold the order

        //checking if SEt run duplicate
        setOfStrings.add("Banana");
        System.out.println(setOfStrings);


        // setOfStrings.clear(); - clears the Set

        if(setOfStrings.contains("Raspberry"))
            System.out.println("The set contains Raspberry");
        else
            System.out.println("It doesnt contains Raspberry");
        setOfStrings.remove("Banana");

        System.out.println("Banana is removed: " + setOfStrings);

        System.out.println("The size of set: " + setOfStrings.size());

        list.add("Banana");
        list.add("Strawberry");
        list.add("Raspberry");
        list.add("Blueberry");
        list.add("Blackberry");

        System.out.println("This is our ArrayList: " + list);

        HashSet<String> set4 = new HashSet<>(list); //converting the ArrayList to HashSet
        System.out.println("This is our HashSet: " + set4);

        if(set4.add("Blackberry"))
            System.out.println("There is no such value in set, I am adding it ");
        else System.out.println("There is already value in set, I am not adding");

        //for loop is not applicable for Sets since we dont have .get() method


        System.out.println("We are using Iterator to parse through Set: ");
        //we can use for each loop as well
        Iterator iterator = set4.iterator();
        while(iterator.hasNext()) {

            String currentElementInTheSet = (String)iterator.next();
            //we are using casting for next(), because it returns Object type
            System.out.println(currentElementInTheSet + " ");

        }



    }
}
