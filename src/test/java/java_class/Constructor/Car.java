package Constructor;

public class Car {

    public void move() {
        System.out.println("Car is moving");
        //move();    //assertion
    }

    public static void main(String[] args) {
        Car car1 = new Car();
      //  car1 = null;

        car1.move();



    }
}
