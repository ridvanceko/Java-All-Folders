package map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Employee {

    String name;
    String city;
    int age;
    String emloyeeID;

//    public Employee(String name, String city, int age, String emloyeeID) {
//
//        this.name = name;
//        this.city = city;
//        this.age = age;
//        this.emloyeeID = emloyeeID;
//    }

    public Employee(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.emloyeeID = generate();  //test driven development
    }
    /*

      How to convert  String to primitive data type?
     "123" --> Integer.parseInt("123");
      How to convert String to wrapper class object?
     "123" --> Long.valueOf("123");
      How to convert primitive to String?
      123 --> ""+123; -->
      String.valuOf(123); --> it will return String data type.


    */


    public String generate() {

      int num = (int)(Math.random()*10000000);

      return "" + num;
            // i need to Cast double to string
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmloyeeID() {
        return emloyeeID;
    }

    public void setEmloyeeID(String emloyeeID) {
        this.emloyeeID = emloyeeID;
    }


    // GENERATED INFO

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", emloyeeID='" + emloyeeID + '\'' +
                '}';
    }
}


//EMPLOYEE:
//Create one employee class with names, city, age, employee id
//Create one constructor to initialize instance variables.
//Create getters and setters for instance variables
//Create one method will generate 8 digits random employee id

