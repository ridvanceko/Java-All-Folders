package OOP.Vehicles;

public class Vehicle {

    protected String model;
    int year;                 //by default
    public String brand;

    public void drive() {
        System.out.println("Vehicle is moving");
    }

    public boolean stop() {
        System.out.println("Vehicle is stopping");
        return true;
    }

    protected boolean start() {
        System.out.println("Vehicle is starting");
        return true;
    }

    Object accelerate() {

        //Object  [] values={"Test", 12, 1.2, true};

       return new Object();  //I can say String as well.
    }

    public Vehicle(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

}



/*
- Vehicle
        one protected String model
        one default access modifier and int year
        one public brand
        Methods:
            - drive() --> vehicle is moving.
            - stop() --> return true and prints the 'vehicle is stopping'
            - protected start() --> return true and prints the 'vehicle is starting'
            - Create one accelerate() method with default access modifier and return the Object.
        Constructor:
        Create one constructor to initialize the instance variables for Vehicle class.

 */