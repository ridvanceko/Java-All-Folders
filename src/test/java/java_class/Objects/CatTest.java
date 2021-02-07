package Objects;

public class CatTest {

    public static void main(String[] args) {
        Cat  cat = new Cat();
        cat.name="Biley";
        cat.mealAmount=50;
        cat.setName("Miley");

        System.out.println(cat.name);
        System.out.println(cat.getName());

        cat.run("left");
        cat.run("left");
        cat.run("left");
        cat.run("left");
        cat.run("left");
        System.out.println(cat.mealAmount);

    }
}
