package Inheritance;

public class WildAnimal extends Animal{


  // @Override
    // Speak is not Overriding from the parent class. It is new method for Wild Animals
    public void speak() {
        System.out.println("Wild animal is speaking");
    }

    //Override is optional
    public void run() {
        System.out.println("Wild animal is running");
    }


    public static void main(String[] args) {

        WildAnimal wAnimal = new WildAnimal();

        wAnimal.eat();
      //  wAnimal.speak();  we can not inherit the features from the siblings
        // speak() method is available only for Domestic Animals

        Animal animal = new Animal();
        animal.eat();

    }
}
