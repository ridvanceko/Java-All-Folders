package OOP.Polymorphism;

public class Client {

    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.deposit();
        bank.loan();
        bank.openBranch();

        Branch branch = new Bank();
        branch.hire();

        branch.deposit();
        branch.displayBalance();
        // Upcasting, we do not need to write it explicitly
        // Java will cast the value implicitly

        ATM atm = new ATM();
        atm.displayBalance();
        atm.deposit();
        atm.withdraw();
        ((Branch)atm).hire();
        // we can down cast the reference explicitly

    }
}
