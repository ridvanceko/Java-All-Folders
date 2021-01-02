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
        
    }
}
