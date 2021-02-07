package map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class Demographics {
    public static void main(String[] args) {

        ArrayList<HashMap<String, String>> people=new ArrayList<HashMap<String, String>>();

        HashMap<String, String> person1=new HashMap<>();
        HashMap<String, String> person2=new HashMap<>();
        HashMap<String, String> person3=new HashMap<>();
        HashMap<String, String> person4=new HashMap<>();
        HashMap<String, String> person5=new HashMap<>();
        HashMap<String, String> person6 = new HashMap<>();
        HashMap<String, String> person7 = new HashMap<>();
        HashMap<String, String> person8 = new HashMap<>();
        HashMap<String, String> person9 = new HashMap<>();
        HashMap<String, String> person10 = new HashMap<>();

        person1.put("FirstName", "Sandeep"); person1.put("LastName", "Tushar");
        person1.put("Age", "22"); person1.put("Gender", "Male"); person1.put("City", "Chicago");
        person1.put("TempDay1", "100"); person1.put("TempDay2", "97"); person1.put("TempDay3", "100");
        people.add(person1);
        person2.put("FirstName", "Kumar"); person2.put("LastName", "Patel");
        person2.put("Age", "40"); person2.put("Gender", "Male"); person2.put("City", "Schaumburg");
        person2.put("TempDay1", "100"); person2.put("TempDay2", "100"); person2.put("TempDay3", "102");
        people.add(person2);
        person3.put("FirstName", "Michael"); person3.put("LastName", "Tushar");
        person3.put("Age", "22"); person3.put("Gender", "Male"); person3.put("City", "Skokie");
        person3.put("TempDay1", "97"); person3.put("TempDay2", "100"); person3.put("TempDay3", "102");
        people.add(person3);
        person4.put("FirstName", "Priyanka"); person4.put("LastName", "Khan");
        person4.put("Age", "22"); person4.put("Gender", "Female"); person4.put("City", "Des Plaines");
        person4.put("TempDay1", "96"); person4.put("TempDay2", "98"); person4.put("TempDay3", "100");
        people.add(person4);
        person5.put("FirstName", "Arti"); person5.put("LastName", "Puri");
        person5.put("Age", "22"); person5.put("Gender", "Female"); person5.put("City", "Arlington Heights");
        person5.put("TempDay1", "96"); person5.put("TempDay2", "100"); person5.put("TempDay3", "101");
        people.add(person5);

        /*person6.put("FirstName", "Nandi"); person6.put("LastName", "Puri");
        person6.put("Age", "18"); person6.put("Gender", "Female");
        person6.put("City", "Chicago");
        person6.put("Temp", "100");
        people.add(person6);
        person7.put("FirstName", "Rami"); person7.put("LastName", "Khan");
        person7.put("Age", "18"); person7.put("Gender", "Male");
        person7.put("City", "Winnetka");
        person7.put("Temp", "100");
        people.add(person7);
        person8.put("FirstName", "Anish"); person8.put("LastName", "Ray");
        person8.put("Age", "7"); person8.put("Gender", "Male");
        person8.put("City", "Winnetka");
        person8.put("Temp", "100");
        people.add(person8);
        person9.put("FirstName", "Janew"); person9.put("LastName", "Jason");
        person9.put("Age", "45"); person9.put("Gender", "Male");
        person9.put("City", "New York");
        person9.put("Temp", "100");
        people.add(person9);
        person10.put("FirstName", "Binita"); person10.put("LastName", "Jason");
        person10.put("Age", "22"); person10.put("Gender", "Female");
        person10.put("City", "New York");
        person10.put("Temp", "100");
        people.add(person10);*/

        for (HashMap<String,String> person:people) {
            if(person.get("City").equals("Chicago")){
                //System.out.println(person.get("FirstName")+" "+person.get("LastName"));
            }
        }
        for (HashMap<String,String> person:people) {
            if(Integer.parseInt(person.get("Age")) <19 && person.get("Gender").equalsIgnoreCase("Male")){
                System.out.println(person.get("FirstName")+" "+person.get("LastName"));
            }
        }
        for (HashMap<String,String> person:people) {
            int age=Integer.parseInt(person.get("Age"))+1;
            person.put("Age", String.valueOf(age));
        }
        System.out.println(people);
        for (HashMap<String,String> person:people) {
            if(Double.parseDouble(person.get("TempDay1")) >=100 && Double.parseDouble(person.get("TempDay2")) >=100
                    && Double.parseDouble(person.get("TempDay3")) >=100){
                System.out.println(person.get("FirstName")+" "+person.get("LastName"));
            }
        }
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