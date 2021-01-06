package ArrayListPractice;

import java.util.*;
public class SortingNames {
    public static void main(String[] args) {

        List <String> firstNames = new ArrayList<>();  //names
        firstNames.add("Ramis");
        firstNames.add("Ari");
        firstNames.add("Ela");
        firstNames.add("Chopa");


        List <String> lastNames = new ArrayList<>(); //lastnames ..
        lastNames.add("Lopez");
        lastNames.add("Whatever");
        lastNames.add("Grande");
        lastNames.add("Gomez");

        List<String> firstNamesAndLastNames = new ArrayList<>();
        for (int i = 0; i <firstNames.size();  i++) {

            firstNamesAndLastNames.add(firstNames.get(i) + " " + lastNames.get(i));
        }

        Collections.sort(firstNamesAndLastNames);

        firstNames.clear();
        lastNames.clear();


        for (int i = 0; i <firstNamesAndLastNames.size(); i++) {
            String [] names = firstNamesAndLastNames.get(i).split(" ");

            firstNames.add(names[0]);
            lastNames.add(names[1]);

        }
        System.out.println(firstNames);
        System.out.println(lastNames);


        for(int i = 0; i < firstNames.size(); i++){
            System.out.println(firstNames.get(i) + " " + lastNames.get(i));
        }
        // int[] arr; arr[4]
        // ArrayList list; list.get(4)


        // System.out.println(firstNamesAndLastNames);

    }

}
