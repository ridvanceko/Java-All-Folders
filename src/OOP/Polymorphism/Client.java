package OOP.Polymorphism;

public class Client {

    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.deposit();
        bank.loan();
        bank.openBranch();
    }
}
