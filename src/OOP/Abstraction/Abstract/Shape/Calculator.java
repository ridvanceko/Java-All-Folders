package OOP.Abstraction.Abstract.Shape;

public class Calculator {

    public static void main(String[] args) {

        Rectangle rc = new Rectangle("Rectangle", 10.5, 5.4);

        System.out.println(rc.getArea());
        System.out.println(rc.getPerimeter());
    }
}
