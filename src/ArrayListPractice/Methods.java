package ArrayListPractice;

import java.util.ArrayList;

public class Methods {
    public static void main(String[] args) {

        //if you do not give the data type, by default it will be Object data type

        ArrayList items = new ArrayList();
        items.add("apple");
        items.add("banana");
        items.add(Boolean.TRUE);
        items.add(false);




     // REMOVE method
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Chicago");
        cities.add("Denver");
        cities.add("New York");
        cities.add("Chicago");
        cities.add("Denver");
        cities.add("LA");
        System.out.println(cities);

        ArrayListIntro.print(cities); //ask this Renas??

        cities.remove("Chicago");
        cities.remove(3);
        System.out.println(cities);
        System.out.println(cities.remove(1));
        System.out.println(cities);
        System.out.println(cities.remove("Chicago"));
        System.out.println(cities);


       // cities.remove(4); it will throw an error




    }
}
