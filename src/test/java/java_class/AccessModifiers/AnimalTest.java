package AccessModifiers;


public class AnimalTest {

    public static void main(String[] args) {

        Animal animal = new Animal();

        System.out.println(animal.name);
       System.out.println(animal.age);
       System.out.println(animal.color);
      //  System.out.println(animal.gender);


        animal.run();
        animal.eat();
      //  animal.sleep(); // --> it is private access modifier
        animal.walk();



    }


}
