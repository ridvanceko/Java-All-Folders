package OOP.Abstraction.Abstract;

public abstract class Student  {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //abstract method can be public, default, protected
    abstract  void attend();

    public abstract void speak();

    public void studentInfo() {
        System.out.println("Name: " +name+ " Age: " + age);
    }


}
