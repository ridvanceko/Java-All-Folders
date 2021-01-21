package OOP.Inheritance1;

public class Meshoo extends Dog{


    // if the parent class has no no-argument constructor child class must crate the constructor
    // and implement the super class constructor.

    public Meshoo() {
           super("Meshoo", 1, 3, 10);
    }

    public Meshoo(String name, int height, int weight) {
        super(name, 1, height, weight);

    }

    public static void main(String[] args) {

        Meshoo meshoo = new Meshoo();
        System.out.println(meshoo.name);
        // System.out.println(meshoo.weight) --> since the weight is private we can reach

        System.out.println(meshoo.getWeight()); // -->  now we can get it

        Meshoo newMeshoo = new Meshoo("Meshoo 1", 2, 12);
        System.out.println(newMeshoo.name);
        System.out.println(newMeshoo.age);
        System.out.println(newMeshoo.getWeight());
    }
}
