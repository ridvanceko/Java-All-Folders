package Sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HashSetPractice2 {
    public static void main(String[] args) {

        String[] arrayOfString = {"Banana", "Grapefruit", "Apple", "Strawberry", "Raspberry", "Blueberry",
                "Blackberry", "Apple", "Pear", "Banana", "Grapefruit"};
           //find me the only unique items


        // Array -> ArrayList -> HashSet
        //check if Array -> HashSet convertable
        //add one by one each element of Array to HashSet !!!

        //the first approach
        //Array -> ArrayList -> HashSet
//
//        List<String> list = Arrays.asList(arrayOfString);//  --> you can use another variable for List and convert it to HashSet
//        HashSet<String> set = new HashSet<>(list);


        HashSet<String> set = new HashSet(Arrays.asList(arrayOfString));
        System.out.println(set);


        // add one by one each element of Array to HashSet
        HashSet<String> set1 = new HashSet();
        for (int i = 0; i <arrayOfString.length ; i++) {
            set1.add(arrayOfString[i]);

        }

        System.out.println(set1);

        // Find the items which have duplicates only, Example Banana, Apple, Grapefruit

        //set.add(Object) -> true/false. If the value exists it returns false

        HashSet<String> set2 = new HashSet<>();
         HashSet<String> set3 = new HashSet<>();

//         ArrayList<String> list1 = new ArrayList<>();
//
//        for(String item : arrayOfString) {
//            if(!set2.add(item)) {
//                list1.add(item);
//            }
//
//        }
//        System.out.println(list1);



        for(String item : arrayOfString) {
            if(!set2.add(item)) {
                set3.add(item);
            }
        }
        System.out.println(set3);

    }
}


//You are given an array of String.  Find the items which have duplicates only. Example Banana, Aple, Grapefruit.
// initial Array                      set2.add (line 41)                  set3 (line 42)
//"Banana",                             true
//"Grapefruit",                         true
//"Apple",                          true
//"Strawberry",                         true
//"Raspberry",                      true
//"Blueberry",                      true
//"Blackberry",                         true
//"Apple",                          false (doesn't add Apple)               added, (true - but
//                                                                                aren't using it)
//"Pear",                           true
//"Banana",                             false                                   added, true
//"Grapefruit",                         false                                   added, true
//"Apple",                          false                                   rejected, false
//"Pear",                           false                                   added, true
//"Grapefruit"                      false                                   rejected, false
//Collapse
//
//
//
//white_check_mark
//eyes
//raised_hands