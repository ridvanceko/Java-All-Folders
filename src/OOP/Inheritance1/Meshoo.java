package OOP.Inheritance1;

import OOP.Inheritance.Animal;
import OOP.Inheritance.Cat;

public class Meshoo extends Dog{

   String name;
    // if the parent class has no no-argument constructor child class must crate the constructor
    // and implement the super class constructor.

    public Meshoo() {
           super("Meshoo", 1, 3, 10);
           this.name = "Meshoo";
        System.out.println("Test");
    }

    public Meshoo(String name, int height, int weight) {
        super(name, 1, height, weight); }


    public void play(){
        System.out.println(super.name + " is playing"); // i can say also this.name
    }

    @Override
    public Cat barking() {
        System.out.println(this.name + " is barking");
        return new Cat ();
    }


    public static void main(String[] args) {

        Meshoo meshoo = new Meshoo();
        System.out.println(meshoo.name);
        // System.out.println(meshoo.weight) --> since the weight is private we can reach
        System.out.println(meshoo.getWeight());
        meshoo.play();

        System.out.println(meshoo.getWeight()); // -->  now we can get it

        Meshoo newMeshoo = new Meshoo("Meshoo 1", 2, 12);
        System.out.println(newMeshoo.name);
        System.out.println(newMeshoo.age);
        System.out.println(newMeshoo.getWeight());

        newMeshoo.barking();
    }
}
