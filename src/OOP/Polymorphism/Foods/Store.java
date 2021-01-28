package OOP.Polymorphism.Foods;

public class Store {

    public static void main(String[] args) {

        Food food = new Carrot();
        System.out.println(food.getDetails());
        System.out.println(food.getPrice());
        System.out.println( ((Vegetable)food).color());
    }
}
