package Objects;

public class Icloud {

    String userName;
    String familyName= "Hunt"; //if family name is 'static String familyName' it will print the same
    // if it not updated name will be print it

    //every object has own family name but family name is same "Hunt"

   static int storage = 2048; //GB   (for using from every person storage we have to STATIC)

    public void store(int gb) {   //storePicture if there is 'repeating' use methods, loop etc.
        storage-=gb;
        System.out.println("Current empty space is " + storage);
    }

//    public void storeVideo (int gb) {
//        storage-=gb;
//        System.out.println("Current empty spcae is " + storage);
//    }

}
