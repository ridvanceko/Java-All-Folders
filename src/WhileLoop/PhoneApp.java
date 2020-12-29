package WhileLoop;

public class PhoneApp {
    public static void main (String []args) {

    //keep calling -->


        int balance = 50;
        int count = 1;


        while(balance>0) {
            System.out.println("Talking " + count++);
            balance-=5;
        }

        System.out.println(balance);
        System.out.println(count);


    }
}
