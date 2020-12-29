package StringExample;

public class StringMethodsTwo {
    public static void main(String [] args) {

        String device = "mic rophone";

        System.out.println(device.charAt(4));

        char letter = device.charAt(8); //return type of charAt() method is char
        System.out.println(letter);

        System.out.println(device.indexOf("m"));
        System.out.println(device.indexOf(" "));
        System.out.println(device.indexOf("rop"));// it will return index number for first matching element
        System.out.println(device.indexOf("k")); //if there is no matching letter it will return -1
        System.out.println(device.indexOf("ono")); //it will return -1  --> should be matching exactly will all letters
        System.out.println(device.indexOf("o")); //it will give the index number of first matching 'o'
        System.out.println(device.indexOf("on")); //for getting second second 'o' we can use next letter
        System.out.println(device.indexOf("o", 6)); //it will get second 'o'
        System.out.println(device.indexOf("o", device.indexOf("o")+1));


    }
}
