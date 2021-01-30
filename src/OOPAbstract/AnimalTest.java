package OOPAbstract;

public class AnimalTest {
    public static void main(String[] args) {

        LandAnimal landAnimal = new LandAnimal("Ejderya", "blue", 97, 900);

        landAnimal.drink();
        landAnimal.hunting();
        System.out.println(landAnimal.name);


    }
}
