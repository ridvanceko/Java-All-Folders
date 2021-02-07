package StringExample;

public class StringMethodsFour {

    public static void main(String [] args) {
        String email="tectorial@gmail.com";
        int indexNum = email.indexOf("@"); //
        System.out.println(indexNum);
        System.out.println(email.substring(indexNum)); //



   //print after '.'           "substring"
        int index = email.indexOf(".")+1; // --> index of '.' is 11
        System.out.println(email.substring(index));
        System.out.println(email.substring(email.length()-3));



        String name = "Jennifer";
        System.out.println(name.substring(1,5));  //1,2,3,4

        name = name.substring(5);  //fer
        System.out.println(name);


        String name1 = "Melissa";
        //name.substring(20); //--> throws the exception on runtime error
       // name.substring(4,2); //throws the exception on runtime error
        name.substring(3,3); //returns empty string





        /*      replace()
        String school = "techtorial";

        school.replace("e", "E"); //tEchtorial

        school.replace("tech", "TECH"); //TECHTorial

        school.replace("t", "T"); //TechTorial

       */

        String car = "honda";
        System.out.println(car.replace("h", "H"));

        car = car.replace("honda", "Toyota");
        System.out.println(car);
        System.out.println(car.replace("o", "1"));


        String city = "     Los Angeles    ";
       System.out.println(city.trim());

    }
}
