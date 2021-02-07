package OOP.Abstraction.Abstract;

public abstract class SelfPacedStudent extends Student {


    public SelfPacedStudent(String name, int age) {
        super(name, age);
    }

    abstract void learn();
}
