package OOPAbstract;

public class LandAnimal extends Animal{

    public LandAnimal (String name, String color, int age, int weight) {
        super(name, color, age, weight);
    }



    @Override
    void eat() {
        System.out.println("Land animal is eating");
    }

    @Override
    void drink() {
        System.out.println("Land animal is drinking");
    }

    @Override
    void resting() {
        System.out.println("Land animal is resting");
    }

    @Override
    void hunting() {
        System.out.println("Land animal is hunting");
    }

    void run () {
        System.out.println(name + " is running");
    }

    void walking() {
        System.out.println(name + " is walking");
    }
}
