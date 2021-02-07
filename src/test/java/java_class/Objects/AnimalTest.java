package Objects;

public class AnimalTest {

    public static void main(String[] args) {


        Animal cat = new Animal();

        cat.name="Miley";
        cat.age=7;
        cat.color="Tuxedo";
        cat.energy=0;

        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.color);
        System.out.println(cat.energy);

        cat.speak();
        cat.sleep();
        System.out.println("Cat energy:  " + cat.energy);

                                  //If return type is void we cannot sout



        Animal dog = new Animal();

        dog.name="Benchot";
        dog.age=2;
        dog.color="brown";
        dog.energy=3;

        System.out.println(dog.name);
        System.out.println(dog.age);
        System.out.println(dog.color);
        System.out.println(dog.energy);

        dog.speak();
        dog.sleep();


        System.out.println("Dog energy: " + dog.energy);



    }


}


