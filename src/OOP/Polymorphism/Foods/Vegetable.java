package OOP.Polymorphism.Foods;

public abstract class Vegetable implements Food {

    public int getPrice() {
        return 2;
    }

    public String color() {
        return "Green";
    }
}
