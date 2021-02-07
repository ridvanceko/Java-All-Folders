package OOP.Abstraction.Interface;

public interface Memory extends MemoryCard{

    public static final int CAPACITY = 64;

     public default void call() {
         System.out.println("The phone is ringing");

         //we can Override default but we cannot static method

    }

    // even without access modifier it is assume it is public and abstract
    public abstract void speak();

    public static void play() {
         System.out.println("Phone is playing");
     }

}
