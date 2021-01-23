package OOP.Vehicles;

public class Car extends Vehicle {

    String model;
    double engineSize;


    public Car(String model, String brand, int year) {
        super(model, brand, year);
        // it is calls the constructor from parent class
        //it should be in the first line
    }

    @Override
    public void drive() {
        System.out.println("Car is moving");
    }

    //check what is Autoboxing!!!!
    //casting with explicite and inplicite

    public Integer accelerate() {
        System.out.println(super.model + " is the car");
        return 10;
    }

    public boolean stop() {
        System.out.println("Car is stopping");
        return false;
    }

    public long transmission() {
        return 5;
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Corolla", "Toyota", 2018);
        vehicle.accelerate();

        Car car = new Car("Accord", "Honda", 2012);
        car.accelerate();
        System.out.println(car.model);
    }


}


/*
- Car
        * extends the Vehicle
        - Create one String Model;
        - Create one engine type;
        - Override the drive method from the parent class and print 'Car is moving'
        - Override the accelerate() method from parent class and returns the Integer
        and calls the Model of the vehicle from Parent class.

 */