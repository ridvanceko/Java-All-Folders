package OOP.Abstraction.Interface.Fly;

public class Bird implements Flyable{


    @Override
    public void fly() {
        System.out.println("Bird is flying");

    }

    @Override
    public void makeNoise() {
        System.out.println("Bird is chirping");

    }
}
