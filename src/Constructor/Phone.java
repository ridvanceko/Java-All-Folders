package Constructor;

public class Phone {

    String name;


    public  Phone(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Phone one = new Phone("Samsung");
        Phone two = new Phone("Iphone");
        Phone three=one;
        one=two;
        System.out.println(one.equals(two)); //one and two pointing the same object --> "true"
        System.out.println(two.equals(three));  //false
        System.out.println(one == two);  //true
        System.out.println(two == three); //false
    }
}
