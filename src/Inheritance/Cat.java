package Inheritance;

public class Cat extends DomesticAnimals{

    public void jump() {
        System.out.println("Cat is jumping");

    }

    @Override
    public void run() {
        System.out.println("Cat is running");
    }

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.run();
        // -- run method is coming from the Domestic Animal class
        // since it is overriding inside the Domestic Animal class.
        cat.sleep();
        cat.speak();
        // speak() method is coming from the Domestic Animal class since it is not available
        // under the Animal class


    }
}
