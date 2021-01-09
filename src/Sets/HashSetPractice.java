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

        
    }
}
