package OOPAbstract;

public class FlyingAnimal extends Animal{

    String wingSpan;

    public FlyingAnimal (String name, String color, int age, int weight, String wingSpan) {
        super(name, color, age, weight);
        this.wingSpan = wingSpan;

    }

    @Override
    void eat() {
        System.out.println("Fly animal is eating");
    }

    @Override
    void drink() {
        System.out.println("Fly animal is drinking");
    }

    @Override
    void resting() {
        System.out.println("Fly animal is resting");
    }

    @Override
    void hunting() {
        System.out.println("Fly animal is hunting");
    }

    void fly() {
        System.out.println(name + "is flies");
    }

    static void chirp() {
        System.out.println(" is chirping");
    }
}
