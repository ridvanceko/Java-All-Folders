package OOP.Abstraction.Interface.Fly;

public interface Flyable extends Noise {

    int WINGNUM = 2;
    int TAILNUM = 1;

    void fly();

    // we can create the body inside the interface only for
    // dafault methods and static methods

    default void run() {
        System.out.println("it is running");
    }
}
