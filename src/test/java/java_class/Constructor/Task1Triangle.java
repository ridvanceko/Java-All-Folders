package Constructor;

public class Task1Triangle {
    double base;
    double height;

    public  Task1Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getArea() {   //I can use getArea again because
        //it is in different class
        return base*height/2;
    }
}
