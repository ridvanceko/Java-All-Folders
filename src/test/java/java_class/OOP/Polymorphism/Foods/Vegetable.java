package OOP.Polymorphism.Foods;

public abstract class Vegetable extends WholeFood implements Food {

    public int getPrice() {
        return 2;
    }

    public String color() {
        return "Green";
    }
}
