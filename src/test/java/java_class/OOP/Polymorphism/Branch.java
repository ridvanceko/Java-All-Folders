package OOP.Polymorphism;

public class Branch extends ATM{

    public void loan() {

        System.out.println("We can get the loan up to 50k");
    }

    public void hire() {
        System.out.println("We can hire the Teller");
    }

    public void withdraw() {
        System.out.println("You can withdraw the money up to 15k");
    }

    public void deposit() {
        System.out.println("You can deposit up to 100k");
    }


}
