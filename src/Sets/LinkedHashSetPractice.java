package Sets;

//import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.*;

public class LinkedHashSetPractice {
    public static void main(String[] args) {

        LinkedHashSet<String> linkedSet = new LinkedHashSet();

        HashSet<String> set = new HashSet<>();

        set.add("Banana");
        set.add("Grapefruit");
        set.add("Mango");
        set.add("Kiwi");
        System.out.println("Set is unordered --> " + set);


        linkedSet.add("Banana");
        linkedSet.add("Grapefruit");
        linkedSet.add("Mango");
        linkedSet.add("Kiwi");
        System.out.println("LinkedSet is ordered --> " + linkedSet);

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Banana");
        treeSet.add("Grapefruit");
        treeSet.add("Mango");
        treeSet.add("Kiwi");
        treeSet.add("Apple");
        treeSet.add("Strawberry");
        //TreeSet doesnt accept NULL values

        System.out.println("TreeSet puts in order of Letter --> " + treeSet);

    }
}
