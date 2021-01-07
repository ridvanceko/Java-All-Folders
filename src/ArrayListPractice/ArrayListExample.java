package ArrayListPractice;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("David");
        names.add("Marcus");
        names.add("John");
        names.add("Beth");
        names.add("Julia");
        names.add("Rachel");

        System.out.println(names);
        //I want to replace Beth with Jennifer

        String originValue = names.set(names.indexOf( "Beth"), "Jennifer");
        System.out.println("This name is out of the list : " + originValue);

        System.out.println("Changed names after using set method ");
        System.out.println(names);

    }
}
