package map;

import java.util.LinkedHashMap;

public class CountOfChar {


    public static LinkedHashMap<Character, Integer> getCount(String str) {

        LinkedHashMap<Character, Integer> letters = new LinkedHashMap<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(letters.containsKey(ch)) {
                int count = letters.get(i);  //1
                letters.put(ch, ++count);

            } else{
                letters.put(ch, 1);
            }
        }

        return letters;
    }

    public static void main(String[] args) {

        // "parameter" --> create a method will take the String as parameter
        // and it will return count of letters from the map
        // p - 1
        // a -2
        // r - 2
        // m - 1
        // e -2
        // t -1

        System.out.println(getCount("parameter"));
    }


}


// VERY IMPORTANT INTERVIEW QUESTION