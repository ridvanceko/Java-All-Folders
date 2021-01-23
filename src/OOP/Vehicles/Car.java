package OOP.Vehicles;

public class Car extends Vehicle{

    public Car(String model, String brand, int year) {
        super(model, brand, year);
        // it is calls the constructor from parent class
        //it should be in the first line
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