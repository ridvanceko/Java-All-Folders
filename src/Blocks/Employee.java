package Blocks;

import java.time.LocalDate;
import java.util.Random;

public class Employee {

    String employeeID;
    String name;
    int age;
    double salary;
    String department;
    String companyName;
    static double budget; //1000000;


    static {

        //it will run before everything inside this class
        System.out.println("This is static initialization block ");
        budget = 1000000;
    }

    {
        // instance block will run before every object and set the value for instance variables
        System.out.println("This is instance initialization block. ");
        employeeID = generateID();
        department="HR";
        companyName="Apple";
        System.out.println("Closing instance block");

    }

    public Employee() {
       // this.employeeID = generateID();
        System.out.println("This is NO ARGUMENT constructor");
        salary = 50000;
        budget-=salary;


    }


    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
       // this.employeeID = generateID();
        System.out.println("This is 3 ARGUMENT constructor");
        budget-=salary;


    }

    public String generateID() {

        Random random = new Random();
        String id="" + LocalDate.now()+ "-";
        for (int i = 0; i <5; i++) {
            id+=random.nextInt(10);

        }
        return id;

    }


}
