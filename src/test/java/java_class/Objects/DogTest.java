package Objects;

public class DogTest {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.name="Max";
        dog.eat();
        dog.eat();
        dog.eat();
        dog.eat();

        Dog dog1 = new Dog();
        dog.name ="Spike";
        dog1.eat();
        dog1.eat();

        Dog dog2 = new Dog();
        dog.name ="Dublin";
        dog2.eat();

        //since the meal is static variables (Class variable)
        //we need to call using the class name or when we call using
        //the object name it will refer to the same variables

        System.out.println(Dog.meal);
        System.out.println(dog1.meal);

        Dog.barking();

///when its not static runs separately



    }
}
