package OOP.Abstraction.Interface;

public class Samsung extends Phone {

    // Samsung class inherits the Phone, Memory
    // implement the method and create the object inside the
    // phone shop class call all available methods.

    @Override
    public void text() {
        System.out.println("Samsung is texting");

    }

    @Override
    void takePhoto() {
        System.out.println("Samsung is taking photo");

    }

    @Override
    public void scrollDown() {
        System.out.println("Samsung is scrolling down");

    }

    @Override
    public void scrollUp() {
        System.out.println("Samsung is scrolling up");

    }


}
