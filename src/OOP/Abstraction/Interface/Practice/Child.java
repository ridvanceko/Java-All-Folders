package OOP.Abstraction.Interface.Practice;

public class Child extends GrandParent implements Parent {

    public void run() {
        System.out.println("run");
    }

    public static void talk() {
        System.out.println("Child talking");
    }

    public static void move() {
        System.out.println("Child is moving");
    }

    public void start() {
     talk();
    }


}
