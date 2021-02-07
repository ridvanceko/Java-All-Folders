package OOP.Abstraction.Abstract;

public class SelfLearner extends Student {

    public SelfLearner() {
        super("Self", 22);

    }

    public void attend() {
        System.out.println("Self learner started to learn");

    }

    public void speak() {
        System.out.println("Self learner making practice");
    }

    public void learn() {
        System.out.println("Self learner finished teh topic");
    }

    // First class that implements the abstract methods
    // from abstract class is called CONCRETE class.


}
