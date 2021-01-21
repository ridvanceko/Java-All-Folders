package OOP.Inheritance1;

import OOP.Inheritance.Animal;

public class Dog  {

    String name;
    int age;
    public int height;
    public int weight;

    public Dog(String name, int age, int height, int weight) {
       super();   // --> super() is the constructor it is coming from the super/parent class
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;

    }

    public Animal barking() {
        return new Animal();
    }

    public boolean wakeUp() {
        return true;
    }

    public int getWeight() {
        return weight;
    }

}
