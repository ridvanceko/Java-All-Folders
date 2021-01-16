package Blocks;

import AccessModifiers.Animal;

public class AnimalTest extends Animal{


//    public void test() {
//
//        Animal animal = new Animal();
//        animal.walk();
//    }

    public static void main(String[] args) {

        Animal animal = new Animal();

        System.out.println(animal.name);
       // System.out.println(animal.age);

        animal.run();
       // animal.eat(); // default access
       // animal.sleep();
        animal.walk();  //after turn static it worked (protected)

    }


}
