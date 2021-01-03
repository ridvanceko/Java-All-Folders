package ArrayListPractice;

import java.util.ArrayList;
public class ArrayListIntro {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.add("David");
        names.add("Marcus");
        names.add("John");
        //ArrayList follows insertion order

        names.add(1,"Abby");
      //  names.add(10, "Ceko"); --> out of bounds exception error
        names.add(4,"Ridvan");
        names.get(3);

        for (int i = 0; i <names.size(); i++) {
            System.out.println(names.get(i));

        }

        for (String name:names) {
            System.out.println(name);
        }
//        System.out.println(names.get(0));
//        System.out.println(names.get(1));
//        System.out.println(names.get(2));
//        System.out.println(names.get(3));
//        System.out.println(names.get(4));

        System.out.println(names.size());
        print(names); //for printing i have to call
        System.out.println(names);


    }


    //Create the method will take one parameter as ArrayList<String>
    //print all the values from ArrayList which has length more than equals to 5

    public static void  print(ArrayList<String> tests){
        for (int i = 0; i < tests.size(); i++) {
            if(tests.get(i).length()>=5){
                System.out.println("Bigger than 5 " + tests.get(i));  //we have to call that in main method so have to use static
            }
        }
}}
