package ArrayListPractice;
import java.util.ArrayList;
import java.util.List;

public class Methods2 {
    public static void main(String[] args) {


   // SET method (replacing value)
        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Cat");
        animals.set(0,"Dog"); // -->replacing the value
      //  animals.set(4,"Bird"); --> it will throw an error
        System.out.println(animals);

        // EMPTY method
        System.out.println(animals.isEmpty()); //return false "it is just checks if we have any value inside the object"

       // CONTAINS method
        System.out.println(animals.contains("Lion")); // false //
        System.out.println(animals.contains("Dog")); //true
        System.out.println(animals.contains("cat")); //false (because of Lowercase)

        // CLEAR method

         animals.clear(); // --> it will delete all the methods from ArrayList
        System.out.println(animals.isEmpty());  // true
       // System.out.println(animals);


        ArrayList<String> animals1 = new ArrayList<>();
        animals1.add("Dog");
        animals1.add("Cat");
        //System.out.println(animals1);

        System.out.println("Result is: " +animals.equals(animals1));

        //it will return false because previously we clear() everything so there is nothing to compare
        //note: it has to be the same order and the same value




    }
}
