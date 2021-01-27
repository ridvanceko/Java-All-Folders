package OOP.Polymorphism;

public class Bank extends Branch{

    String companyName = "Bank Of America";

    public void loan() {
        System.out.println("You have up to 1 million  limit");
    }

    public void hire() {
        System.out.println("We can hire the manager");
    }

    public void invest() {
        System.out.println("You can invest up to 1 billion");
    }

    public void openBranch() {
        System.out.println("We can open the branch");
    }


}
