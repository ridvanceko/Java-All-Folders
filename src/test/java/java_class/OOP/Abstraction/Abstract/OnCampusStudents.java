package OOP.Abstraction.Abstract;

import Encapsulation.City;

public class OnCampusStudents extends Student {



    String city;
public  OnCampusStudents() {
    super("On-Campus", 30);
    city = "Chicago";
}

   void attend() {
       System.out.println("On-Campus is attending");

    }


    public void speak() {
        System.out.println("On-Campus is speaking");

    }
}
