package OOP.Abstraction.Interface;

public class Iphone extends Phone{

    public void speak(){
        System.out.println("Iphone is speaking");
    }

    public void scrollDown() {
        System.out.println("Iphone is scrolling down");
    }
    public void scrollUp() {
        System.out.println("Iphone is scrolling up");
    }
    public void text() {
        System.out.println("Iphone is texting");
    }

    public void takePhoto() {
        System.out.println("Iphone is taking photo");
    }
}
