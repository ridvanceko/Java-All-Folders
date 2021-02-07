package OOP.Abstraction.Interface.Fly;

public class Plane implements Flyable{

    public void fly() {
        System.out.println("Plane is flying high");
    }

    public void makeNoise() {
        System.out.println("Plane is flying loudly");
    }

    public int getPassengerNumber() {
        return 389;
    }
}
