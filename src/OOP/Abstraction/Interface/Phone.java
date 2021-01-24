package OOP.Abstraction.Interface;

public abstract class Phone implements MemoryCard, TouchScreen{
    String name;
    int screenSize;


    public abstract void text();

    abstract void takePhoto();



    // Play is available inside MemoryCard. Since both of them are static method.
    // It is not overriding. It is hiding the method.
    public static void play() {
        System.out.println("Phone is playing");
    }



}
