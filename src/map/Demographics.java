package map;
import java.util.*;

public class Demographics {
    public static void main(String[] args) {

        // 1.find all people from chicago
        // 2.find all males under age 19
        //if you have ArrayList<String>
        //for(String item: list) {
        //}


        ArrayList<HashMap<String, String>> people = new ArrayList();

        HashMap<String, String> person1 = new HashMap<>();
        person1.put("FirstName", "Checky");
        person1.put("LastName", "Cheko");
        person1.put("Age", "22");
        person1.put("Gender", "Male");
        person1.put("City", "Chicago");
        people.add(person1);

        // people.get().get("Chicago") --> first get() for arrayList second get() for HashMap


        HashMap<String, String> person2 = new HashMap<>();
        person2.put("FirstName", "Kumar");
        person2.put("LastName", "Patel");
        person2.put("Age", "40");
        person2.put("Gender", "Male");
        person2.put("City", "Schaumburg");
        people.add(person2);


        HashMap<String, String> person3 = new HashMap<>();
        person3.put("FirstName", "Michael");
        person3.put("LastName", "Tushar");
        person3.put("Age", "22");
        person3.put("Gender", "Male");
        person3.put("City", "Skokie");
        people.add(person3);

        HashMap<String, String> person4 = new HashMap<>();
        person4.put("FirstName", "Prianka");
        person4.put("LastName", "Khan");
        person1.put("Age", "22");
        person4.put("Gender", "Female");
        person4.put("City", "Des Plaines");
        people.add(person4);


        HashMap<String, String> person5 = new HashMap<>();
        person5.put("FirstName", "Arti");
        person5.put("LastName", "Puri");
        person5.put("Age", "40");
        person5.put("Gender", "Male");
        person5.put("City", "Arlington Heights");
        people.add(person5);


        HashMap<String, String> person6 = new HashMap<>();
        person6.put("FirstName", "Ceko");
        person6.put("LastName", "Cekmez");
        person6.put("Age", "9");
        person6.put("Gender", "Male");
        person6.put("City", "Chicago");
        people.add(person6);

        HashMap<String, String> person7 = new HashMap<>();
        person7.put("FirstName", "Jenna");
        person7.put("LastName", "Cekmez");
        person7.put("Age", "36");
        person7.put("Gender", "Female");
        person7.put("City", "Chicago");
        people.add(person7);

        HashMap<String, String> person8 = new HashMap<>();
        person8.put("FirstName", "Miley");
        person8.put("LastName", "Cekmez");
        person8.put("Age", "7");
        person8.put("Gender", "Female");
        person8.put("City", "Las Vegas");
        people.add(person8);

        HashMap<String, String> person9 = new HashMap<>();
        person9.put("FirstName", "Ridvan");
        person9.put("LastName", "Cekmez");
        person9.put("Age", "29");
        person9.put("Gender", "Male");
        person9.put("City", "Tucson");
        people.add(person9);

        HashMap<String, String> person10 = new HashMap<>();
        person10.put("FirstName", "Dublin");
        person10.put("LastName", "Ireland");
        person10.put("Age", "8");
        person10.put("Gender", "Male");
        person10.put("City", "Tucson");
        people.add(person10);

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);

        //  System.out.println(people);

        System.out.println("All people from Chicago");
        for (HashMap<String, String> person : people) {
            if (person.get("City").equalsIgnoreCase("chicago")) {

                System.out.println(person.get("FirstName") + " " + person.get("LastName"));
            }
        }

        System.out.println("All males under age 19: ");
        for (HashMap<String, String> person : people) {
            if (Integer.parseInt(person.get("Age")) < 19 && person.get("Gender").equalsIgnoreCase("male")) {

                System.out.println(person.get("FirstName") + " " + person.get("LastName"));
            }
        }

        System.out.println(people);
        System.out.println("Add 1 year for each person age: ");
        for(HashMap<String, String> person: people) {
           // Integer.parseInt(person.get("Age")); //current age
         //   Integer.parseInt(person.get("Age")) + 1; //updated age

           int age =  Integer.parseInt(person.get("Age")) + 1;
           person.put("Age", String.valueOf(age));

           // person.put("Age", String.valueOf( Integer.parseInt(person.get("Age")) + 1)); the same result

        }
        System.out.println(people);


    }
}




//FirstName: Sandeep
//LastName: Tushar
//Age: 22
//Gender: male
//City: Chicago

//FirstName: Kumar
//LastName: Patel
//Age: 40
//Gender: male
//City: Schaumburg

//FirstName: Michael
//LastName: Tushar
//Age: 22
//Gender: male
//City: Skokie

//FirstName: Prianka
//LastName: Khan
//Age: 22
//Gender: female
//City: Des Plaines

//FirstName: Arti
//LastName: Puri
//Age: 22
//Gender: female
//City: Arlington heights
//
//
//
//
//white_check_mark
//eyes
//raised_hands