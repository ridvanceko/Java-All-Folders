package Sets;

import java.util.HashSet;

public class FlowerTest {
    public static void main(String[] args) {

        Flower f1 = new Flower("Rose", "Red");
        Flower f2 = new Flower("Violet", "White");
        Flower f3 = new Flower("Daisy", "Purple");
        Flower f4 = new Flower("Orchid", "Orange");
        Flower f5 = new Flower("Tulip", "Yellow");


   // if you dont define the datatype by default
        // will be Object the data type of the HashSet

        HashSet <Flower> flowers = new HashSet(); //my collection is flowers
        flowers.add(f1);
        flowers.add(f2);
        flowers.add(f3);
        flowers.add(f4);
        flowers.add(f5);


        for(Flower flower: flowers) {
            System.out.println(flower.toString()); //we call the collections
        }

    }
}





//FLOWERTEST
//Create one flowerTest class
//Create 5 flower object
//Create one HashSet collection to store 5 flower object.
//Print all name and color of the flowers from hashSet.