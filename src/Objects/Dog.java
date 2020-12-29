package Objects;

public class Dog {

    String name;
    String color;                     //instance variables
    int age;
  static   int meal=20;     //when its static its different

    public void eat() {

        meal = meal-1;
        System.out.println(name + " is eating. Leftover kg " + meal);


    }

    public static void barking() {
        System.out.println("Dog is barking");  //i cannot call the "name" here. Check the class notes


    }


}
