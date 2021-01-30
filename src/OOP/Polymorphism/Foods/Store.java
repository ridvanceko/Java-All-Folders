package OOP.Polymorphism.Foods;

public class Store {

    public static void main(String[] args) {

        Food food = new Carrot();
        System.out.println(food.getDetails());
        System.out.println(food.getPrice());
        System.out.println( ((Vegetable)food).color());

        System.out.println();
//        Vegetable vegetable = (Vegetable) new WholeFood();
//        vegetable.getName();


        //It is a relationship
        //since the food is a Carrot once we initialize the Food
        // we can cast explicitly food to the Vegetable
        //Because food pointing to the Carrot. It is also down casting.

        System.out.println(food instanceof Carrot);
        System.out.println(food instanceof Vegetable);
        System.out.println(food instanceof WholeFood);
        System.out.println(food instanceof Food);


        Vegetable vegetable = (Vegetable)food;
        vegetable.getName();


        // wholefood IS A RELATIONSHIP
        WholeFood wholeFood = new WholeFood();

        System.out.println(wholeFood instanceof Carrot);
        //wholeFood cannot be instance of the Carrot
        System.out.println(wholeFood instanceof Food);
        System.out.println(wholeFood instanceof WholeFood);

    }
}
