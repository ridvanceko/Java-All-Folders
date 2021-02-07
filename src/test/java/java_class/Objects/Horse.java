package Objects;

public class Horse {

    //while we are creating the blueprint of the object
    //we do NOT need to use Main Method

    String name = "Duldul";
    int age;
    char gender;
    double weight;
    double height;
    String color;

    public static void main(String[] args) {

        Horse horse1 = new Horse();
        horse1.name="Mustang";
        horse1.age=3;
        horse1.gender='M';
        horse1.weight=2.3;
        horse1.height=4.9;
        horse1.color="brown";

        System.out.println(horse1.name);
        System.out.println(horse1.age);
        System.out.println(horse1.gender);
        System.out.println(horse1.color);

        Horse horse2=new Horse();
        horse2.age=8;
        System.out.println(horse2.age);
    }
}
