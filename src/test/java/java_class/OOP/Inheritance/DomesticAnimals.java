package OOP.Inheritance;

public class DomesticAnimals extends Animal{

    public void speak() {
        System.out.println("Animal is speaking");
    }


    //Method Overriding --> using method overriding we can update and change the
    // implementation for the methods

    @Override
    public void run() {
        System.out.println("Domestic Animal is running");
    }


    // it is coming from child class



    public static void main(String[] args) {
        DomesticAnimals dAnimal = new DomesticAnimals();

        dAnimal.run();
        dAnimal.speak();

        Animal animal = new Animal();
        animal.run();
        // animal.speak(); --> speak() method is not available for Parent class.


    }

}