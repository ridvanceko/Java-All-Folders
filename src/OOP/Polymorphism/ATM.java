package OOP.Polymorphism;

public class ATM {

    public void withdraw() {
        System.out.println("You can witdraw up to 1k a day");
    }

    public void deposit() {
        System.out.println("you can deposit up to 1k in one time");
    }

    public void displayBalance() {
        System.out.println("50000");
    }
}
