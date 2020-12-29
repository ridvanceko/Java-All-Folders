package Variables;

public class VariableFirst {

    public static void main(String [] args) {
    //Java reads the code top to bottom and left to right

        int redApple=4;
        int yellowApple=20;
        int greenApple=3;

        int redApplePrice=3;
        int yellowApplePrice=2;
        int greenApplePrice=5;




        System.out.println(redApple*redApplePrice);
        System.out.println(yellowApple*yellowApplePrice);
        System.out.println(greenApple*greenApplePrice);

     int totalPrice=(redApple*redApplePrice)+(yellowApple*yellowApplePrice)+(greenApple*greenApplePrice);

     System.out.println("Total Price is= "+totalPrice);

       System.out.println("I have " + redApple + " apple");
       System.out.println("I have " + yellowApple + " apple");
       System.out.println("I have " + greenApple + " apple");
    }

}
